package com.junhojeong.apiserver.service;

import com.junhojeong.apiserver.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class PostingServiceImpl implements PostingService {
    @Override
    public List<Post> getPosts() throws ExecutionException, InterruptedException {

        return null;
    }
}
