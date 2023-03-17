package pl.olxy.logic.service;

import pl.olxy.domain.Account;

import java.util.Optional;

public interface IAccountService {

    Optional<Account> findAccountByUsername(String username);

    void save(Account account);
}
