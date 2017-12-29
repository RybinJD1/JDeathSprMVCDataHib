package org.arpit.java2blog.repository;


import org.arpit.java2blog.model.Account;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AccountRepository extends CrudRepository<Account, Integer> {


//    @Query("select sum(a.balance) from account a")
    int getSumAcc();

    List<Account> findTopByOrderByBalanceDesc();
}
