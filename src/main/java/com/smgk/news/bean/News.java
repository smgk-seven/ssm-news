package com.smgk.news.bean;

import java.util.Date;

public class News {
    private Integer newsId;

    private String newsTitle;

    private String newsContent;

    private Date newsTime;

    private String newsSummary;

    private String newsTopImg;

    private Integer newsUser;

    private Integer newsViewCount;

    private Integer newsGenre;
    
    private User user;
    private String ReturnDate;
    private Genre genre;
    

    public Genre getGenre() {
		return genre;
	}

	public void setGenre(Genre genre) {
		this.genre = genre;
	}

	public String getReturnDate() {
		return this.newsTime.toLocaleString();
	}

	public void setReturnDate(String returnDate) {
		ReturnDate = returnDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getNewsId() {
        return newsId;
    }

    public void setNewsId(Integer newsId) {
        this.newsId = newsId;
    }

    public String getNewsTitle() {
        return newsTitle;
    }

    public void setNewsTitle(String newsTitle) {
        this.newsTitle = newsTitle == null ? null : newsTitle.trim();
    }

    public String getNewsContent() {
        return newsContent;
    }

    public void setNewsContent(String newsContent) {
        this.newsContent = newsContent == null ? null : newsContent.trim();
    }

    public Date getNewsTime() {
        return newsTime;
    }
    
    public void setNewsTime(Date newsTime) {
        this.newsTime = newsTime;
        this.ReturnDate=newsTime.toLocaleString();
    }

    public String getNewsSummary() {
        return newsSummary;
    }

    public void setNewsSummary(String newsSummary) {
        this.newsSummary = newsSummary == null ? null : newsSummary.trim();
    }

    public String getNewsTopImg() {
        return newsTopImg;
    }

    public void setNewsTopImg(String newsTopImg) {
        this.newsTopImg = newsTopImg == null ? null : newsTopImg.trim();
    }

    public Integer getNewsUser() {
        return newsUser;
    }

    public void setNewsUser(Integer newsUser) {
        this.newsUser = newsUser;
    }

    public Integer getNewsViewCount() {
        return newsViewCount;
    }

    public void setNewsViewCount(Integer newsViewCount) {
        this.newsViewCount = newsViewCount;
    }

    public Integer getNewsGenre() {
        return newsGenre;
    }

    public void setNewsGenre(Integer newsGenre) {
        this.newsGenre = newsGenre;
    }
    
	public News() {
		super();
		// TODO Auto-generated constructor stub
	}

	public News(Integer newsId, String newsTitle, String newsContent, Date newsTime, String newsSummary,
			String newsTopImg, Integer newsUser, Integer newsViewCount, Integer newsGenre) {
		super();
		 this.ReturnDate=newsTime.toLocaleString();
		this.newsId = newsId;
		this.newsTitle = newsTitle;
		this.newsContent = newsContent;
		this.newsTime = newsTime;
		this.newsSummary = newsSummary;
		this.newsTopImg = newsTopImg;
		this.newsUser = newsUser;
		this.newsViewCount = newsViewCount;
		this.newsGenre = newsGenre;
	}

	@Override
	public String toString() {
		return "News [newsId=" + newsId + ", newsTitle=" + newsTitle + ", newsContent=" + newsContent + ", newsTime="
				+ newsTime + ", newsSummary=" + newsSummary + ", newsTopImg=" + newsTopImg + ", newsUser=" + newsUser
				+ ", newsViewCount=" + newsViewCount + ", newsGenre=" + newsGenre + ", user=" + user + ", ReturnDate="
				+ ReturnDate + ", genre=" + genre + "]";
	}

	

	
	
	
    
    
}