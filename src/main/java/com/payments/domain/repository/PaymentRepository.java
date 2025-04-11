package com.payments.domain.repository;

import com.payments.domain.aggregate.PaymentAggregate;
import com.payments.domain.valueobject.id.CorrelationId;
import com.payments.domain.valueobject.id.PaymentId;

import java.util.Optional;

public interface PaymentRepository {
    /**
     * Saves or updates a PaymentAggregate.
     *
     * @param payment the aggregate to save
     * @return the saved aggregate
     */
    PaymentAggregate save(PaymentAggregate payment);

    /**
     * Retrieves a PaymentAggregate by its unique PaymentId.
     *
     * @param id the PaymentId
     * @return optional of PaymentAggregate
     */
    Optional<PaymentAggregate> findById(PaymentId id);

    /**
     * Retrieves a PaymentAggregate using its CorrelationId.
     *
     * @param correlationId the CorrelationId
     * @return optional of PaymentAggregate
     */
    Optional<PaymentAggregate> findByCorrelationId(CorrelationId correlationId);
}
