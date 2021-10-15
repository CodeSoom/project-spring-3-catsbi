package com.catsbi.teapit.common.supplier;

/**
 * 인증 정보를 제공한다.
 *
 * @param <K> 식별자 타입
 * @param <P> 비밀번호 타입
 */
public interface AuthenticationSupplier<K, P> extends IdentifierSupplier<K>, PasswordSupplier<P> {
}
