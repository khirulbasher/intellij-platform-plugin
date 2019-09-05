package com.lemon.framework.base.exception.runtime;

public class ObjectInstantiateError extends RuntimeException {

    public ObjectInstantiateError() {
        super("The Object can't instantiate because it's required satisfy the constructor parameter");
    }

    public ObjectInstantiateError(String cause) {
        super("The Object can't instantiate because it's required :" + cause);
    }
}
