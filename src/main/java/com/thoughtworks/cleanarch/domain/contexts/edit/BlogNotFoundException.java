package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.exceptions.DomainException;

public class BlogNotFoundException extends DomainException {

    public BlogNotFoundException(String message) {
        super(message);
    }
}
