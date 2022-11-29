package com.junhojeong.apiserver.service;

import com.junhojeong.apiserver.model.Post;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface PostingService {
    List<Post> getPosts() throws ExecutionException, InterruptedException;
}
