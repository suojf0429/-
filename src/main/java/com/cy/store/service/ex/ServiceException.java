package com.cy.store.service.ex;

/** 业务异常的基类 */
/** service将异常抛给controller层，controller做异常捕捉并能够进行处理*/
public class ServiceException extends RuntimeException {    //快捷键 Ctrl+o
    public ServiceException() {
        super();
    }

    public ServiceException(String message) {
        super(message);
    }

    public ServiceException(String message, Throwable cause) {
        super(message, cause);
    }
    public ServiceException(Throwable cause) {
        super(cause);
    }

    protected ServiceException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
