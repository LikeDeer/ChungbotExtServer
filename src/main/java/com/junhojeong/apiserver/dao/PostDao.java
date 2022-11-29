package com.junhojeong.apiserver.dao;

import com.google.api.core.ApiFuture;
import com.google.firebase.auth.*;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.junhojeong.apiserver.model.Post;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PostDao {
    public static final String COLLECTION_NAME = "Posts";
    private DatabaseReference mDatabase;

    public PostDao() {
        this.mDatabase = FirebaseDatabase.getInstance().getReference("Posts");
    }

    public void setPost() throws Exception {

    }

    public List<Post> getPosts() throws Exception {
        List<Post> posts = new ArrayList<>();

        return posts;
    }
}
