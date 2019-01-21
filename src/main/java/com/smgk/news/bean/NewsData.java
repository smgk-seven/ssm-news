package com.smgk.news.bean;

public class NewsData {
	private int NewsCommentsNum;
	private int NewsCollectNum;
	private int NewsGivegood;
	public int getNewsCommentsNum() {
		return NewsCommentsNum;
	}
	public void setNewsCommentsNum(int newsCommentsNum) {
		NewsCommentsNum = newsCommentsNum;
	}
	public int getNewsCollectNum() {
		return NewsCollectNum;
	}
	public void setNewsCollectNum(int newsCollectNum) {
		NewsCollectNum = newsCollectNum;
	}
	public int getNewsGivegood() {
		return NewsGivegood;
	}
	public void setNewsGivegood(int newsGivegood) {
		NewsGivegood = newsGivegood;
	}
	public NewsData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public NewsData(int newsCommentsNum, int newsCollectNum, int newsGivegood) {
		super();
		NewsCommentsNum = newsCommentsNum;
		NewsCollectNum = newsCollectNum;
		NewsGivegood = newsGivegood;
	}
	

}
