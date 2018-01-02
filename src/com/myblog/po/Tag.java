package com.myblog.po;

public class Tag {
    private String tagId;

    private String blogId;

    private String tagName;

    private String tagMemo;

    public String getTagId() {
        return tagId;
    }

    public void setTagId(String tagId) {
        this.tagId = tagId == null ? null : tagId.trim();
    }

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }

    public String getTagMemo() {
        return tagMemo;
    }

    public void setTagMemo(String tagMemo) {
        this.tagMemo = tagMemo == null ? null : tagMemo.trim();
    }
}