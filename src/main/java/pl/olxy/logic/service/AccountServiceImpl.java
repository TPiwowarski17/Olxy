package pl.olxy.logic.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.olxy.domain.Account;
import pl.olxy.domain.repository.AccountRepository;

import java.util.Optional;

@Service
@RequiredArgsConstructor
class AccountServiceImpl implements IAccountService {

    private final AccountRepository repository;

    @Override
    public Optional<Account> findAccountByUsername(String username) {
        return repository.findAccountByUsername(username);
    }

    @Override
    public void save(Account account) {
        repository.save(account);
    }
}
