package com.pozdeev.HelloWorld.service;

import com.pozdeev.HelloWorld.model.Post;
import com.pozdeev.HelloWorld.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceCRUD implements PostRepository {

    private final PostRepository postRepository;

    public PostServiceCRUD(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @Override
    public void create(Post post) {
        postRepository.save(post);
    }

    @Override
    public List<Post> readAll() {
        return postRepository.findAll();
    }

    @Override
    public Post read(int id) {
        return postRepository.getOne(id);
    }

    @Override
    public boolean update(Post post, int id) {
        if (postRepository.existsById(id)) {
            post.setId(id);
            postRepository.save(post);
            return true;
        }

        return false;
    }

    @Override
    public boolean delete(int id) {
        if (postRepository.existsById(id)) {
            postRepository.deleteById(id);
            return true;
        }
        return false;
    }
}