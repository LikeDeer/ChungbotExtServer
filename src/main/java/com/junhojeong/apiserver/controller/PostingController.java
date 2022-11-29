package com.junhojeong.apiserver.controller;

import com.junhojeong.apiserver.dao.PostDao;
import com.junhojeong.apiserver.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.junhojeong.apiserver.service.PostingService;

@RestController
@RequestMapping("/board")
public class PostingController {
    private final PostingService postService;
    private final PostDao postDao;

    @Autowired
    public PostingController(PostingService postService, PostDao postDao) {
        this.postService = postService;
        this.postDao = postDao;
    }

    @RequestMapping(value="/post", method=RequestMethod.POST)
    public void pushPost(@RequestBody Post post) {

        System.out.println("PostingController >> 'pushPost' done");
    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public void test2() {

    }

    @RequestMapping(value="/read", method=RequestMethod.GET)
    public void test3() {

    }
}
