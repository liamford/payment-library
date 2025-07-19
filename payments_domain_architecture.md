# Payments Domain Architecture Overview

This document provides a high-level overview of the Payments Domain, focusing on its architecture, key technologies, dependencies, and core domain components.

## Technologies and Dependencies

The Payments Domain is a Java-based application built with Spring Boot and Gradle.

*   **Build System**: Gradle
*   **Language**: Java 21
*   **Framework**: Spring Boot 3.4.4
*   **Key Dependencies**:
    *   `org.springframework.boot:spring-boot-starter`: Core Spring Boot functionality.
    *   `org.projectlombok:lombok`: Used to reduce boilerplate code (e.g., getters, setters, constructors).
    *   `org.springframework.boot:spring-boot-starter-test`: For unit and integration testing.
    *   `org.junit.platform:junit-platform-launcher`: For running JUnit 5 tests.

## High-Level Design - Domain-Driven Design (DDD)

The Payments Domain appears to follow a Domain-Driven Design (DDD) approach, organizing code around business concepts. Key DDD building blocks observed include:

*   **Aggregates**: `PaymentAggregate` and `StandingOrderAggregate` act as consistency boundaries, encapsulating related entities and value objects.
*   **Entities**: `BaseEntity` serves as a base for identifiable objects.
*   **Value Objects**: Various value objects (e.g., `PaymentId`, `CorrelationId`, `Authorisation`, `AccountId`) are used to model descriptive aspects of the domain.
*   **Domain Events**: `PaymentInitiatedEvent` is an example of a domain event, indicating something significant has happened within the domain.
*   **Policies**: The `policy` package suggests the use of domain policies to encapsulate business rules.
*   **Specifications**: The `specification` package indicates the use of specifications for defining business rules that can be combined.
*   **Repositories**: `PaymentRepository` suggests an abstraction for data persistence.
*   **Services**: `BaseNppPaymentService` indicates domain services for orchestrating domain logic.

## UML Diagrams

### Class Diagram: Aggregates

This diagram illustrates the core aggregate roots and their relationships within the Payments Domain.

```mermaid
classDiagram
    direction LR
    class BaseEntity~ID~ {
        -ID id
        +BaseEntity(ID id)
        +equals(Object o)
        +hashCode()
    }

    class AggregateRoot~ID~ {
        +AggregateRoot(ID id)
    }

    class PaymentAggregate {
        -CorrelationId correlationId
        -BasePayment payment
        -Authorisation authorisation
        -List~PaymentStatus~ paymentStatusList
        -PaymentStatusCode currentStatusCode
        -AccountId debtorAccountId
        -AccountId creditorAccountId
        -List~Object~ domainEvents
        +PaymentAggregate(PaymentId id, CorrelationId correlationId, BasePayment payment, Authorisation authorisation, AccountId debtorAccountId, AccountId creditorAccountId)
        +addPaymentStatus(PaymentStatus newStatus)
        +getDomainEvents() List~Object~
        +clearDomainEvents()
    }

    class StandingOrderAggregate {
        -CorrelationId correlationId
        -BaseStandingOrder baseStandingOrder
        -Authorisation authorisation
        -List~StandingOrderStatus~ paymentStatusList
        -StandingOrderStatus currentStatusCode
        +StandingOrderAggregate(StandingOrderId id, CorrelationId correlationId, BaseStandingOrder baseStandingOrder, Authorisation authorisation)
    }

    BaseEntity <|-- AggregateRoot
    AggregateRoot <|-- PaymentAggregate
    AggregateRoot <|-- StandingOrderAggregate

    PaymentAggregate "1" --> "1" CorrelationId : has
    PaymentAggregate "1" --> "1" BasePayment : has
    PaymentAggregate "1" --> "1" Authorisation : has
    PaymentAggregate "1" --> "0..*" PaymentStatus : has
    PaymentAggregate "1" --> "1" PaymentStatusCode : has
    PaymentAggregate "1" --> "1" AccountId : debtor
    PaymentAggregate "1" --> "1" AccountId : creditor
    PaymentAggregate "1" --> "0..*" PaymentInitiatedEvent : raises

    StandingOrderAggregate "1" --> "1" CorrelationId : has
    StandingOrderAggregate "1" --> "1" BaseStandingOrder : has
    StandingOrderAggregate "1" --> "1" Authorisation : has
    StandingOrderAggregate "1" --> "0..*" StandingOrderStatus : has