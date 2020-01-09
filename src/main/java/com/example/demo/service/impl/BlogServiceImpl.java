package com.example.demo.service.impl;

import com.example.demo.model.Blog;
import com.example.demo.model.dto.BlogDto;
import com.example.demo.repo.BlogRepository;
import com.example.demo.service.BlogService;
import com.example.demo.service.converter.BlogConverter;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BlogServiceImpl implements BlogService {

    private BlogRepository blogRepository;


    public BlogServiceImpl(BlogRepository blogRepository) {
        this.blogRepository = blogRepository;
    }


    @Override
    public BlogDto blog(BlogDto blogDto) {
        Blog blog1 = BlogConverter.convert(blogDto);
        Blog save = blogRepository.save(blog1);
        BlogDto blogDto1 = BlogConverter.convert(save);
        return blogDto1;
    }

    @Override
    public List<BlogDto> findAll() {
        List<Blog> all = blogRepository.findAll();

        List<BlogDto> blogDtoList = BlogConverter.convert(all);

        return blogDtoList;
    }
    @Override
    public List<BlogDto> findAll(String nickname) {
        List<Blog> all = blogRepository.findAllByUser_Nickname(nickname);

        List<BlogDto> blogDtoList = BlogConverter.convert(all);

        return blogDtoList;
    }

    @Override
    public Optional<Blog> findById(Integer id) {
        return blogRepository.findById(id);
    }
}
