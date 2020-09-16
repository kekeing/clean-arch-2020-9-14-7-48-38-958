package com.thoughtworks.cleanarch.domain.core.exceptions;

public class DomainException extends RuntimeException {
    public DomainException(String message) {
        super(message);
    }
}
