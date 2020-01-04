package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.repo.BlogRepository;
import com.example.demo.service.BlogService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;

    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @Override
    public Blog blog(Blog blog) {
        return blogRepository.save(blog);
    }
}
