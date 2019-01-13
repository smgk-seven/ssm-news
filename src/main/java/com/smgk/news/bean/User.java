package com.smgk.news.bean;

public class User {
    private Integer userId;

    private String nickName;

    private String email;

    private String password;

    private String userGenre;

    private Integer userLike;
    	
    private Genre likeGenre;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getUserGenre() {
        return userGenre;
    }

    public void setUserGenre(String userGenre) {
        this.userGenre = userGenre == null ? null : userGenre.trim();
    }

    public Integer getUserLike() {
        return userLike;
    }

    public void setUserLike(Integer userLike) {
        this.userLike = userLike;
    }


	public Genre getLikeGenre() {
		return likeGenre;
	}

	public void setLikeGenre(Genre likeGenre) {
		this.likeGenre = likeGenre;
	}
	public User() {
	}

	public User(Integer userId, String nickName, String email, String password, String userGenre, Integer userLike) {
		this.userId = userId;
		this.nickName = nickName;
		this.email = email;
		this.password = password;
		this.userGenre = userGenre;
		this.userLike = userLike;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", nickName=" + nickName + ", email=" + email + ", password=" + password
				+ ", userGenre=" + userGenre + ", userLike=" + userLike + ", likeGenre=" + likeGenre + "]";
	}

	
	
    
}