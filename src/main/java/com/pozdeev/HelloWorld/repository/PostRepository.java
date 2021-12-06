package com.pozdeev.HelloWorld.repository;

import com.pozdeev.HelloWorld.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Integer> {
}
