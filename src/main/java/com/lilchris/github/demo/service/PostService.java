package com.lilchris.github.demo.service;

import com.lilchris.github.demo.entities.Post;
import com.lilchris.github.demo.repositories.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    public List<Post> getAllPosts(){
        return postRepository.findAll();
    }

    public Post insert(Post post) {
        return postRepository.save(post);
    }
}
