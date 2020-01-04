package com.example.demo.repo;


import com.example.demo.model.Blog;
import org.springframework.data.jpa.repository.JpaRepository;


public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
