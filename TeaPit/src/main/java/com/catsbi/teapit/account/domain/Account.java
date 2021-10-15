package com.catsbi.teapit.account.domain;

import com.catsbi.teapit.common.domain.TimeEntity;
import com.catsbi.teapit.common.supplier.AuthenticationSupplier;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 회원 정보
 */
@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Account extends TimeEntity implements AuthenticationSupplier<String, String> {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;

    private String name;

    private String password;

    private String mobile;

    private boolean deleted;

    @Override
    public String getIdentifier() {
        return this.email;
    }


    /**
     * TODO
     * - 팀 엔티티가 생성되면 관계 매핑이 필요하다.
     */

}
