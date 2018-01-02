package com.myblog.po;

public class Like {
    private Integer likeCount;

    private Integer dislikeCount;

    private String likeMemo;

    private String blogId;

    public Integer getLikeCount() {
        return likeCount;
    }

    public void setLikeCount(Integer likeCount) {
        this.likeCount = likeCount;
    }

    public Integer getDislikeCount() {
        return dislikeCount;
    }

    public void setDislikeCount(Integer dislikeCount) {
        this.dislikeCount = dislikeCount;
    }

    public String getLikeMemo() {
        return likeMemo;
    }

    public void setLikeMemo(String likeMemo) {
        this.likeMemo = likeMemo == null ? null : likeMemo.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }
}