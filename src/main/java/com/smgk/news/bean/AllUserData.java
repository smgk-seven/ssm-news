package com.smgk.news.bean;

public class AllUserData {
	private Integer AllUserCount;
	private Integer VipUserCount;
	private Integer BTUserCount;
	private Integer ManagerUserCount;
	public Integer getAllUserCount() {
		return AllUserCount;
	}
	public void setAllUserCount(Integer allUserCount) {
		AllUserCount = allUserCount;
	}
	public Integer getVipUserCount() {
		return VipUserCount;
	}
	public void setVipUserCount(Integer vipUserCount) {
		VipUserCount = vipUserCount;
	}
	public Integer getBTUserCount() {
		return BTUserCount;
	}
	public void setBTUserCount(Integer bTUserCount) {
		BTUserCount = bTUserCount;
	}
	public Integer getManagerUserCount() {
		return ManagerUserCount;
	}
	public void setManagerUserCount(Integer managerUserCount) {
		ManagerUserCount = managerUserCount;
	}
	public AllUserData() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AllUserData(Integer allUserCount, Integer vipUserCount, Integer bTUserCount, Integer managerUserCount) {
		super();
		AllUserCount = allUserCount;
		VipUserCount = vipUserCount;
		BTUserCount = bTUserCount;
		ManagerUserCount = managerUserCount;
	}
	@Override
	public String toString() {
		return "AllUserData [AllUserCount=" + AllUserCount + ", VipUserCount=" + VipUserCount + ", BTUserCount="
				+ BTUserCount + ", ManagerUserCount=" + ManagerUserCount + "]";
	}
	
	

}
