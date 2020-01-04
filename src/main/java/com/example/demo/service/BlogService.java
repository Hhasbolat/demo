package com.example.demo.service;

import com.example.demo.model.Blog;

import java.util.List;
import java.util.Optional;

public interface BlogService {

        Blog blog(Blog blog);

        List<Blog> findAll();

        Optional<Blog> findById();
}
