package com.example.demo.service.converter;

import com.example.demo.model.Blog;
import com.example.demo.model.User;
import com.example.demo.model.dto.BlogDto;
import com.example.demo.model.dto.UserDto;

import java.util.ArrayList;
import java.util.List;

public class BlogConverter {

    public static Blog convert(BlogDto blogDto){
        Blog blog = new Blog();
        blog.setText(blogDto.getText());

        return blog;
    }
    public static BlogDto convert(Blog blog){
        BlogDto blogDto = new BlogDto();
        blogDto.setText(blog.getText());

        return blogDto;
    }
    public static List<BlogDto> convert(List<Blog> blogList){
        List<BlogDto> blogDtoList = new ArrayList<>();

        for (Blog strings : blogList){
            BlogDto blogDto = new BlogDto();

            blogDto.setText(strings.getText());

            blogDtoList.add(blogDto);
        }
        return blogDtoList;
    }
}
