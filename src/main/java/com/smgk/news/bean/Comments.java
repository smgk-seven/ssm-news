package com.smgk.news.bean;

import java.util.Date;

public class Comments {
    private Integer commentsId;

    private String commentsContent;

    private Date commentsTime;

    private Integer commentsUser;

    private Integer commentsNews;

    public Integer getCommentsId() {
        return commentsId;
    }

    public void setCommentsId(Integer commentsId) {
        this.commentsId = commentsId;
    }

    public String getCommentsContent() {
        return commentsContent;
    }

    public void setCommentsContent(String commentsContent) {
        this.commentsContent = commentsContent == null ? null : commentsContent.trim();
    }

    public Date getCommentsTime() {
        return commentsTime;
    }

    public void setCommentsTime(Date commentsTime) {
        this.commentsTime = commentsTime;
    }

    public Integer getCommentsUser() {
        return commentsUser;
    }

    public void setCommentsUser(Integer commentsUser) {
        this.commentsUser = commentsUser;
    }

    public Integer getCommentsNews() {
        return commentsNews;
    }

    public void setCommentsNews(Integer commentsNews) {
        this.commentsNews = commentsNews;
    }
}