package com.santana.socialnetwork.server.controllers;

import java.util.List;

import javax.inject.Inject;

import org.apache.commons.collections.IteratorUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.santana.socialnetwork.model.Post;
import com.santana.socialnetwork.server.repository.PostRepository;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Inject
    PostRepository postRepository;

    @RequestMapping("/getLatest")
    public List<Post> getLatestPosts() {
    	return IteratorUtils.toList(postRepository.findAll().iterator());
    }
}