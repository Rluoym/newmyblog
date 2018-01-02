package com.myblog.po;

import java.util.Date;

public class Blog {
    private String blogId;

    private String blogTitle;

    private String blogContent;

    private Date blogCreatetime;

    private Date blogUpdatetime;

    private String blogMemo;

    public String getBlogId() {
        return blogId;
    }

    public void setBlogId(String blogId) {
        this.blogId = blogId == null ? null : blogId.trim();
    }

    public String getBlogTitle() {
        return blogTitle;
    }

    public void setBlogTitle(String blogTitle) {
        this.blogTitle = blogTitle == null ? null : blogTitle.trim();
    }

    public String getBlogContent() {
        return blogContent;
    }

    public void setBlogContent(String blogContent) {
        this.blogContent = blogContent == null ? null : blogContent.trim();
    }

    public Date getBlogCreatetime() {
        return blogCreatetime;
    }

    public void setBlogCreatetime(Date blogCreatetime) {
        this.blogCreatetime = blogCreatetime;
    }

    public Date getBlogUpdatetime() {
        return blogUpdatetime;
    }

    public void setBlogUpdatetime(Date blogUpdatetime) {
        this.blogUpdatetime = blogUpdatetime;
    }

    public String getBlogMemo() {
        return blogMemo;
    }

    public void setBlogMemo(String blogMemo) {
        this.blogMemo = blogMemo == null ? null : blogMemo.trim();
    }
}