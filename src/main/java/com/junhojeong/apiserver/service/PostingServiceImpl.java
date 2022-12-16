package com.junhojeong.apiserver.service;

import com.junhojeong.apiserver.dao.PostDao;
import com.junhojeong.apiserver.model.Post;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.concurrent.ExecutionException;

@Service
@RequiredArgsConstructor
public class PostingServiceImpl implements PostingService {
    private final PostDao postDao;
    @Override

    public List<Post> getPosts() {
        try {
            return postDao.getPosts();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
