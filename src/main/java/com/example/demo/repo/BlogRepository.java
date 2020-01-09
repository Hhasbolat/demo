package com.example.demo.repo;


import com.example.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface BlogRepository extends JpaRepository<Blog, Integer> {
    List<Blog> findAllByUser_Nickname(String nickname);
}
