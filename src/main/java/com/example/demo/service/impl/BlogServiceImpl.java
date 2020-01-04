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
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog putText(Blog text) {
        text.setText("selam");
        return blogRepository.save(text);
    }
}
