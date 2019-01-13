package com.smgk.news.bean;

public class Photo {
    private Integer photoId;

    private String photoUrl;

    private String photoName;

    private Integer photoNews;

    private Integer photoUser;

    public Integer getPhotoId() {
        return photoId;
    }

    public void setPhotoId(Integer photoId) {
        this.photoId = photoId;
    }

    public String getPhotoUrl() {
        return photoUrl;
    }

    public void setPhotoUrl(String photoUrl) {
        this.photoUrl = photoUrl == null ? null : photoUrl.trim();
    }

    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName == null ? null : photoName.trim();
    }

    public Integer getPhotoNews() {
        return photoNews;
    }

    public void setPhotoNews(Integer photoNews) {
        this.photoNews = photoNews;
    }

    public Integer getPhotoUser() {
        return photoUser;
    }

    public void setPhotoUser(Integer photoUser) {
        this.photoUser = photoUser;
    }
}