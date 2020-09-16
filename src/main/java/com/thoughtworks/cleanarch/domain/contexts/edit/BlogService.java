package com.thoughtworks.cleanarch.domain.contexts.edit;

import com.thoughtworks.cleanarch.domain.core.concepts.DomainService;

public class BlogService implements DomainService {
    private final BlogRepository blogRepository;

    public BlogService(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }

    public Blog create(String title,String content){
        Blog blog = new Blog(title,content);
        this.blogRepository.save(blog);
        return blog;
    }
    public Blog get(String id) {
       Blog blog = this.blogRepository.getById(id).orElseThrow(() -> new BlogNotFoundException("blog不存在"));
       return blog;
    }
}
