package com.junhojeong.apiserver.controller;

import com.junhojeong.apiserver.dao.PostDao;
import com.junhojeong.apiserver.model.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.junhojeong.apiserver.service.PostingService;

import java.util.List;
import java.util.concurrent.ExecutionException;

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

    }

    @RequestMapping(value="/list", method=RequestMethod.GET)
    public void test2() {

    }

    @RequestMapping(value="/read", method=RequestMethod.GET)
    public ResponseEntity<List<Post>> test3() {
        List<Post> list = null;
        try {
            list = postService.getPosts();
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return ResponseEntity.ok().body(list);
    }
}
