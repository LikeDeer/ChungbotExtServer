package com.junhojeong.apiserver.dao;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.firebase.auth.*;
import com.google.firebase.cloud.FirestoreClient;
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
        this.mDatabase = FirebaseDatabase.getInstance().getReference(COLLECTION_NAME);
    }

    public void setPost() throws Exception {

    }

    public List<Post> getPosts() throws Exception {
        List<Post> list = new ArrayList<>();
        Firestore db = FirestoreClient.getFirestore();
        ApiFuture<QuerySnapshot> future = db.collection(COLLECTION_NAME).get();
        List<QueryDocumentSnapshot> documents = future.get().getDocuments();
        for (QueryDocumentSnapshot document : documents) {
            list.add(document.toObject(Post.class));
        }

        return list;
    }
}
