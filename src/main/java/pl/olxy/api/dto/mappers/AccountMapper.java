package pl.olxy.api.dto.mappers;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import pl.olxy.api.dto.AccountDto;
import pl.olxy.domain.Account;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountMapper {

    public static Account map(AccountDto dto) {
        Account account = new Account();
        account.setUsername(dto.getUsername());
        account.setPassword(dto.getPassword());
        return account;
    }
}
