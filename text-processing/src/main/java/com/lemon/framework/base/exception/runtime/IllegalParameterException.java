package com.lemon.framework.base.exception.runtime;

public class IllegalParameterException extends RuntimeException {
    public IllegalParameterException() {
        this("Parameter not appropriate to demand");
    }

    public IllegalParameterException(String message) {
        super(message);
    }
}
