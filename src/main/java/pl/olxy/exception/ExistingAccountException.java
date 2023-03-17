package pl.olxy.exception;

public class ExistingAccountException extends BusinessException {

    public ExistingAccountException() {
        super("Account exists");
    }
}
