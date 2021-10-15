package com.catsbi.teapit.common.supplier;

/**
 * 비밀번호 정보를 제공한다.
 *
 * @param <T> 비밀번호 타입
 */
@FunctionalInterface
public interface PasswordSupplier<T> {
    T getPassword();
}
