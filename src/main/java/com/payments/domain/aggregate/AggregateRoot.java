package com.payments.domain.aggregate;

import com.payments.domain.entity.BaseEntity;

public abstract class AggregateRoot<ID> extends BaseEntity<ID> {

    protected AggregateRoot(ID id) {
        super(id);
    }
}
