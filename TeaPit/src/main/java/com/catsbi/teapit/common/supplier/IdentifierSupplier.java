package com.catsbi.teapit.common.supplier;

/**
 * 식별자 정보를 제공한다.
 *
 * @param <T> 식별자 타입
 */
@FunctionalInterface
public interface IdentifierSupplier<T> {
    T getIdentifier();
}
