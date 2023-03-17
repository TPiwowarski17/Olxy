package pl.olxy.logic.validators;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountLengthValidatorTest {

    @Test
    void shouldNotPassWhenPasswordIsShorterThan8Characters() {
        //given
        String password = "12345678";
        //when
        boolean result = AccountLengthValidator.validate(password);
        //then
        assertFalse(result);
    }

    @Test
    void shouldNotPassWhenPasswordIsLongerThan12Characters() {
        //given
        String password = "1234567890abc";
        //when
        boolean result = AccountLengthValidator.validate(password);
        //then
        assertFalse(result);
    }

    @Test
    void shouldNotPassWhenPasswordIsNull() {
        //given
        String password = null;
        //when
        boolean result = AccountLengthValidator.validate(password);
        //then
        assertFalse(result);
    }

    @Test
    void shouldPassWhenPasswordLengthIsBetween8And12Characters() {
        //given
        String password = "1234567890";
        //when
        boolean result = AccountLengthValidator.validate(password);
        //then
        assertTrue(result);
    }
}