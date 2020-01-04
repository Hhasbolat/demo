package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.service.BlogService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public Blog blog(@RequestBody Blog blog){
        return blogService.blog(blog);
    }
    @RequestMapping(method = RequestMethod.GET)
    public List<Blog> findAll(){
        return blogService.findAll();
    }
    @RequestMapping(path = "/2", method = RequestMethod.GET)
    public Optional<Blog> findById(){
        return blogService.findById();
    }
}
