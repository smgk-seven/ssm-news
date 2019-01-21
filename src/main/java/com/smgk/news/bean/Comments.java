package com.smgk.news.bean;

import java.util.Date;

public class Comments {
    private Integer commentsId;

    private String commentsContent;

    private Date commentsTime;

    private Integer commentsUser;

    private Integer commentsNews;
    
    private String CommentTimeStr;
    
    private User user;
    
    

    public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public String getCommentTimeStr() {
		return this.commentsTime.toLocaleString();
	}

	public void setCommentTimeStr(String commentTimeStr) {
		CommentTimeStr = this.commentsTime.toLocaleString();
	}

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
    	this.CommentTimeStr=commentsTime.toLocaleString();
        return commentsTime;
    }

    public void setCommentsTime(Date commentsTime) {
    	this.CommentTimeStr=commentsTime.toLocaleString();
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

	public Comments() {
	}

	public Comments(Integer commentsId, String commentsContent, Date commentsTime, Integer commentsUser,
			Integer commentsNews) {
		super();
		this.commentsId = commentsId;
		this.commentsContent = commentsContent;
		this.commentsTime = commentsTime;
		this.commentsUser = commentsUser;
		this.commentsNews = commentsNews;
	}

	@Override
	public String toString() {
		return "Comments [commentsId=" + commentsId + ", commentsContent=" + commentsContent + ", commentsTime="
				+ commentsTime + ", commentsUser=" + commentsUser + ", commentsNews=" + commentsNews
				+ ", CommentTimeStr=" + CommentTimeStr + ", user=" + user + "]";
	}

	
    
    
}