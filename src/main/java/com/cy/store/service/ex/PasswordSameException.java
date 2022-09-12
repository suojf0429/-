package com.cy.store.service.ex;

public class PasswordSameException extends ServiceException {
    public PasswordSameException() {
        super();
    }

    public PasswordSameException(String message) {
        super(message);
    }

    public PasswordSameException(String message, Throwable cause) {
        super(message, cause);
    }

    public PasswordSameException(Throwable cause) {
        super(cause);
    }

    protected PasswordSameException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
