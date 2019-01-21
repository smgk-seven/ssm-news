package com.smgk.news.bean;

public class GiveGood {
    private Integer giveGoodId;

    private Integer giveGoodUser;

    private Integer giveGoodNews;

    public Integer getGiveGoodId() {
        return giveGoodId;
    }

    public void setGiveGoodId(Integer giveGoodId) {
        this.giveGoodId = giveGoodId;
    }

    public Integer getGiveGoodUser() {
        return giveGoodUser;
    }

    public void setGiveGoodUser(Integer giveGoodUser) {
        this.giveGoodUser = giveGoodUser;
    }

    public Integer getGiveGoodNews() {
        return giveGoodNews;
    }

    public void setGiveGoodNews(Integer giveGoodNews) {
        this.giveGoodNews = giveGoodNews;
    }

	public GiveGood() {
	}

	public GiveGood(Integer giveGoodId, Integer giveGoodUser, Integer giveGoodNews) {
		this.giveGoodId = giveGoodId;
		this.giveGoodUser = giveGoodUser;
		this.giveGoodNews = giveGoodNews;
	}
	
    
}