# Payments Domain Aggregate Class Diagram

```plantuml
@startuml
skinparam classAttributeIconSize 0

abstract class AggregateRoot<ID> {
    # ID id
    + AggregateRoot(ID id)
}

abstract class BaseEntity<ID> {
    # ID id
    + BaseEntity(ID id)
}

abstract class BasePayment {
    - InstructionIdentification instructionIdentification
    - EndToEndIdentification endToEndIdentification
    - InstructedAmount instructedAmount
    - LocalInstrument localInstrument
    - InstructionPriority instructionPriority
    - ConsentId consentId
    - Account debtorAccount
    - Account creditorAccount
    - SupplementaryData supplementaryData
    - String serviceLevel
    - Agent creditorAgent
    - Agent debtorAgent
    - Agent ultimateDebtor
    - Agent ultimateCreditor
    - ProcessingDetails processingDetails
    - PostalAddress creditorPostalAddress
    - RemittanceInformation remittanceInformation
    - List<Charge> charges
    - Risk risk
    + BasePayment(PaymentId paymentId, InstructionIdentification instructionIdentification, EndToEndIdentification endToEndIdentification, InstructedAmount instructedAmount, LocalInstrument localInstrument, InstructionPriority instructionPriority)
}

abstract class BaseStandingOrder {
    - LocalDateTime creationDateTime
    - MandateRelatedInformation mandateRelatedInformation
    - ConsentId consentId
    - LocalDateTime statusUpdateDateTime
    - InstructedAmount firstPaymentAmount
    - InstructedAmount recurringPaymentAmount
    - InstructedAmount finalPaymentAmount
    - RemittanceInformation remittanceInformation
    - Account debtorAccount
    - Account creditorAccount
    - Agent ultimateDebtor
    - Agent ultimateCreditor
    - List<Charge> charges
    - Risk risk
    - SupplementaryData supplementaryData
    + BaseStandingOrder(StandingOrderId standingOrderId, LocalDateTime creationDateTime, MandateRelatedInformation mandateRelatedInformation)
}

class PaymentAggregate {
    - CorrelationId correlationId
    - BasePayment payment
    - Authorisation authorisation
    - List<PaymentStatus> paymentStatusList
    - PaymentStatusCode currentStatusCode
    - AccountId debtorAccountId
    - AccountId creditorAccountId
    - List<Object> domainEvents
    + PaymentAggregate(PaymentId id, CorrelationId correlationId, BasePayment payment, Authorisation authorisation, AccountId debtorAccountId, AccountId creditorAccountId)
    + addPaymentStatus(PaymentStatus newStatus)
    + getDomainEvents(): List<Object>
    + clearDomainEvents()
}

class StandingOrderAggregate {
    - CorrelationId correlationId
    - BaseStandingOrder baseStandingOrder
    - Authorisation authorisation
    - List<StandingOrderStatus> paymentStatusList
    - StandingOrderStatus currentStatusCode
    + StandingOrderAggregate(StandingOrderId id, CorrelationId correlationId, BaseStandingOrder baseStandingOrder, Authorisation authorisation)
}

BaseEntity <|-- AggregateRoot
AggregateRoot <|-- PaymentAggregate
AggregateRoot <|-- StandingOrderAggregate

BasePayment <|-- PaymentAggregate : "uses"
BaseStandingOrder <|-- StandingOrderAggregate : "uses"

PaymentAggregate "1" *-- "1" BasePayment : "contains"
PaymentAggregate "1" *-- "1" Authorisation : "contains"
PaymentAggregate "1" *-- "1" CorrelationId : "contains"
PaymentAggregate "1" *-- "1" AccountId : "debtor"
PaymentAggregate "1" *-- "1" AccountId : "creditor"
PaymentAggregate "1" *-- "0..*" PaymentStatus : "has"

StandingOrderAggregate "1" *-- "1" BaseStandingOrder : "contains"
StandingOrderAggregate "1" *-- "1" Authorisation : "contains"
StandingOrderAggregate "1" *-- "1" CorrelationId : "contains"
StandingOrderAggregate "1" *-- "0..*" StandingOrderStatus : "has"

BasePayment "1" *-- "1" InstructionIdentification : "contains"
BasePayment "1" *-- "1" EndToEndIdentification : "contains"
BasePayment "1" *-- "1" InstructedAmount : "contains"
BasePayment "1" *-- "1" LocalInstrument : "contains"
BasePayment "1" *-- "1" InstructionPriority : "contains"
BasePayment "1" *-- "0..1" ConsentId : "contains"
BasePayment "1" *-- "0..1" Account : "debtor"
BasePayment "1" *-- "0..1" Account : "creditor"
BasePayment "1" *-- "0..1" SupplementaryData : "contains"
BasePayment "1" *-- "0..1" Agent : "creditor"
BasePayment "1" *-- "0..1" Agent : "debtor"
BasePayment "1" *-- "0..1" Agent : "ultimate debtor"
BasePayment "1" *-- "0..1" Agent : "ultimate creditor"
BasePayment "1" *-- "0..1" ProcessingDetails : "contains"
BasePayment "1" *-- "0..1" PostalAddress : "creditor"
BasePayment "1" *-- "0..1" RemittanceInformation : "contains"
BasePayment "1" *-- "0..*" Charge : "has"
BasePayment "1" *-- "0..1" Risk : "contains"

BaseStandingOrder "1" *-- "1" MandateRelatedInformation : "contains"
BaseStandingOrder "1" *-- "0..1" ConsentId : "contains"
BaseStandingOrder "1" *-- "0..1" InstructedAmount : "first payment"
BaseStandingOrder "1" *-- "0..1" InstructedAmount : "recurring payment"
BaseStandingOrder "1" *-- "0..1" InstructedAmount : "final payment"
BaseStandingOrder "1" *-- "0..1" RemittanceInformation : "contains"
BaseStandingOrder "1" *-- "0..1" Account : "debtor"
BaseStandingOrder "1" *-- "0..1" Account : "creditor"
BaseStandingOrder "1" *-- "0..1" Agent : "ultimate debtor"
BaseStandingOrder "1" *-- "0..1" Agent : "ultimate creditor"
BaseStandingOrder "1" *-- "0..*" Charge : "has"
BaseStandingOrder "1" *-- "0..1" Risk : "contains"
BaseStandingOrder "1" *-- "0..1" SupplementaryData : "contains"

@enduml