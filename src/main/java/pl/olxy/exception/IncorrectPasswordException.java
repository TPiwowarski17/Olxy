package pl.olxy.exception;

public class IncorrectPasswordException extends BusinessException {

    public IncorrectPasswordException() {
        super("Incorrect password length");
    }
}
