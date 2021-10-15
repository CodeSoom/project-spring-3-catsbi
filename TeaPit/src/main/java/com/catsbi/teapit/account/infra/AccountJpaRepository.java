package com.catsbi.teapit.account.infra;

import com.catsbi.teapit.account.domain.Account;
import com.catsbi.teapit.account.domain.AccountRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountJpaRepository extends JpaRepository<Account, Long>, AccountRepository {
}
