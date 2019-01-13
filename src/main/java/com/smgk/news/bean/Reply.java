package com.smgk.news.bean;

import java.util.Date;

public class Reply {
    private Integer replyId;

    private Integer replyUser;

    private Integer replyToUser;

    private Integer replyComments;

    private Date replyTime;

    private String replyContent;

    public Integer getReplyId() {
        return replyId;
    }

    public void setReplyId(Integer replyId) {
        this.replyId = replyId;
    }

    public Integer getReplyUser() {
        return replyUser;
    }

    public void setReplyUser(Integer replyUser) {
        this.replyUser = replyUser;
    }

    public Integer getReplyToUser() {
        return replyToUser;
    }

    public void setReplyToUser(Integer replyToUser) {
        this.replyToUser = replyToUser;
    }

    public Integer getReplyComments() {
        return replyComments;
    }

    public void setReplyComments(Integer replyComments) {
        this.replyComments = replyComments;
    }

    public Date getReplyTime() {
        return replyTime;
    }

    public void setReplyTime(Date replyTime) {
        this.replyTime = replyTime;
    }

    public String getReplyContent() {
        return replyContent;
    }

    public void setReplyContent(String replyContent) {
        this.replyContent = replyContent == null ? null : replyContent.trim();
    }
}