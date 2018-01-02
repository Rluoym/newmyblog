package com.myblog.po;

import java.util.Date;

public class BlogCategory {
    private String blogCategoryId;

    private String blogCategoryName;

    private Date blogCategoryCreatetime;

    private Date blogCategoryUpdatetime;

    private String blogCategoryMemo;

    public String getBlogCategoryId() {
        return blogCategoryId;
    }

    public void setBlogCategoryId(String blogCategoryId) {
        this.blogCategoryId = blogCategoryId == null ? null : blogCategoryId.trim();
    }

    public String getBlogCategoryName() {
        return blogCategoryName;
    }

    public void setBlogCategoryName(String blogCategoryName) {
        this.blogCategoryName = blogCategoryName == null ? null : blogCategoryName.trim();
    }

    public Date getBlogCategoryCreatetime() {
        return blogCategoryCreatetime;
    }

    public void setBlogCategoryCreatetime(Date blogCategoryCreatetime) {
        this.blogCategoryCreatetime = blogCategoryCreatetime;
    }

    public Date getBlogCategoryUpdatetime() {
        return blogCategoryUpdatetime;
    }

    public void setBlogCategoryUpdatetime(Date blogCategoryUpdatetime) {
        this.blogCategoryUpdatetime = blogCategoryUpdatetime;
    }

    public String getBlogCategoryMemo() {
        return blogCategoryMemo;
    }

    public void setBlogCategoryMemo(String blogCategoryMemo) {
        this.blogCategoryMemo = blogCategoryMemo == null ? null : blogCategoryMemo.trim();
    }
}