package com.catsbi.teapit.account.domain;

import com.catsbi.teapit.common.domain.TimeEntity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 회원 권한 정보
 */
@Entity
public class AccountRole extends TimeEntity {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String scope;
}
