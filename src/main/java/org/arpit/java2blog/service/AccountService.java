package org.arpit.java2blog.service;

import com.google.common.collect.Lists;
import org.arpit.java2blog.model.Account;
import org.arpit.java2blog.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AccountService {

    @Autowired
    private AccountRepository accountRepository;

    public List<Account> findAll() {
        return Lists.newArrayList(accountRepository.findAll());
    }

    public Account findById(int id) {
        return accountRepository.findOne(id);
    }

    public int sumAllAccounts() {
        return accountRepository.getSumAcc();
    }

    public List<Account> maxAccount() {
        return Lists.newArrayList(accountRepository.findTopByOrderByBalanceDesc());
    }
}
