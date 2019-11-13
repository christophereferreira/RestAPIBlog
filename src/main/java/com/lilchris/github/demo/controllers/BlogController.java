package com.lilchris.github.demo.controllers;

import com.lilchris.github.demo.entities.Post;
import com.lilchris.github.demo.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

@RestController
public class BlogController {

    @Autowired
    private PostService postService;

    @GetMapping(value = "api/posts")
    public List<Post> posts(){
        return postService.getAllPosts();
    }

    @PostMapping(value = "api/newpost")
    public void publishPost(@Valid @RequestBody Post newPost){
        postService.insert(newPost);
    }

}
