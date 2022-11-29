package com.junhojeong.apiserver.model;


import com.google.type.Date;

public class Post {
    private int postId;
    private String writer;
    private Date date;
    private String title;
    private String content;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPostId() {
        return postId;
    }

    public void setPostId(int postId) {
        this.postId = postId;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() { return this.date; }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
