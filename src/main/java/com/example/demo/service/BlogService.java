package com.example.demo.service;

import com.example.demo.model.Blog;
import com.example.demo.model.dto.BlogDto;

import java.util.List;
import java.util.Optional;

public interface BlogService {

        BlogDto blog(BlogDto blog);

        List<BlogDto> findAll();

        Optional<Blog> findById(Integer id);
}
