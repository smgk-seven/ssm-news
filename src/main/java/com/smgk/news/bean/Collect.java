package com.smgk.news.bean;

public class Collect {
    private Integer collectId;

    private Integer collectUser;

    private Integer collectNews;

    public Integer getCollectId() {
        return collectId;
    }

    public void setCollectId(Integer collectId) {
        this.collectId = collectId;
    }

    public Integer getCollectUser() {
        return collectUser;
    }

    public void setCollectUser(Integer collectUser) {
        this.collectUser = collectUser;
    }

    public Integer getCollectNews() {
        return collectNews;
    }

    public void setCollectNews(Integer collectNews) {
        this.collectNews = collectNews;
    }
    
	public Collect() {
	}

	public Collect(Integer collectId, Integer collectUser, Integer collectNews) {
		super();
		this.collectId = collectId;
		this.collectUser = collectUser;
		this.collectNews = collectNews;
	}

	@Override
	public String toString() {
		return "Collect [collectId=" + collectId + ", collectUser=" + collectUser + ", collectNews=" + collectNews
				+ "]";
	}
	
    
}