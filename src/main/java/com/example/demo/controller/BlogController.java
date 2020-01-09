package com.example.demo.controller;

import com.example.demo.model.Blog;
import com.example.demo.model.dto.BlogDto;
import com.example.demo.service.BlogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(path = "/blog")
public class BlogController {

    private final BlogService blogService;

    public BlogController(BlogService blogService) {
        this.blogService = blogService;
    }

    @RequestMapping(method = RequestMethod.POST)
    public BlogDto blog(@RequestBody BlogDto blog){
        return blogService.blog(blog);
    }

    @RequestMapping(method = RequestMethod.GET)
    public List<BlogDto> findAll(){
        return blogService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, params = "nickname")
    public List<BlogDto> findAll(@RequestParam("nickname") String nickname){
        return blogService.findAll(nickname);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    //@PathVariable("id") == @PathVariable olabilir aynı şey path ismi id olduğu için :D
    public ResponseEntity<Blog> findById(@PathVariable("id") Integer id){
            return ResponseEntity.of(blogService.findById(id));
    }
}
