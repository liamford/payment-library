package com.payments.domain.specification;

@FunctionalInterface
public interface BaseSpecification <T>{
    boolean isSatisfiedBy(T candidate);

    default BaseSpecification<T> and(BaseSpecification<T> other) {
        return candidate -> this.isSatisfiedBy(candidate) && other.isSatisfiedBy(candidate);
    }

    default BaseSpecification<T> or(BaseSpecification<T> other) {
        return candidate -> this.isSatisfiedBy(candidate) || other.isSatisfiedBy(candidate);
    }

    default BaseSpecification<T> not() {
        return candidate -> !this.isSatisfiedBy(candidate);
    }

}
