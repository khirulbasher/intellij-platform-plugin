package com.lemon.framework.base.exception.runtime;

public class NotImplementedException extends RuntimeException {

    public NotImplementedException() {
        super("The Method doesn't implemented yet.");
    }

    public NotImplementedException(String message) {
        super(message);
    }
}
