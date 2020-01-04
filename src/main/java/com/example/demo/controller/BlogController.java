package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.repo.BlogRepository;
import com.example.demo.service.impl.BlogServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private final BlogServiceImpl blogService;

    public BlogController(BlogServiceImpl blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public Blog putText(Blog blog){
        return blogService.putText(blog);
    }





}
