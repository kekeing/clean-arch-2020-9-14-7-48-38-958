package com.thoughtworks.cleanarch.domain.contexts.edit;

import java.util.Optional;

public interface BlogRepository {
    void save(Blog blog);

    Optional<Blog> getById(String id);

}
