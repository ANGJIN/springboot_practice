package com.example.org.springboot_practice.domain.posts;

import org.springframework.data.jpa.repository.JpaRepository;
public interface PostsRepository extends JpaRepository<Posts,Long>{
}
