package pl.olxy.api;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.olxy.api.dto.AccountDto;
import pl.olxy.api.dto.mappers.AccountMapper;
import pl.olxy.exception.ExistingAccountException;
import pl.olxy.domain.Account;
import pl.olxy.exception.IncorrectPasswordException;
import pl.olxy.logic.service.IAccountService;

import java.util.Optional;

import static pl.olxy.logic.validators.AccountLengthValidator.validate;

@RestController
@RequestMapping("/account")
@RequiredArgsConstructor
public class AccountController {

    private final IAccountService accountService;
    
    @PostMapping
    public void addAccount(@RequestBody AccountDto dto) {
        Optional<Account> existingAccount = accountService.findAccountByUsername(dto.getUsername());
        if (existingAccount.isPresent()) {
            throw new ExistingAccountException();
        }
        if (!validate(dto.getPassword())) {
            throw new IncorrectPasswordException();
        }
        accountService.save(AccountMapper.map(dto));
    }
}
