package pl.olxy.logic.validators;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class AccountLengthValidator {

    private static final int MIN_LENGTH = 8;
    private static final int MAX_LENGTH = 12;

    public static boolean validate(String password) {
        return password != null
                && password.length() < MAX_LENGTH
                && password.length() > MIN_LENGTH;
    }
}
