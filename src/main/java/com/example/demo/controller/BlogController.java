package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import com.example.demo.service.impl.BlogServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogServiceImpl blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Blog blog(@RequestBody Blog blog){
        return blogService.blog(blog);
    }
}
