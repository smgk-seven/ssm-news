package com.smgk.news.bean;

public class Vip {
    private Integer vipId;

    private String vipHandlerStatus;

    private Integer vipUser;

    public Integer getVipId() {
        return vipId;
    }

    public void setVipId(Integer vipId) {
        this.vipId = vipId;
    }

    public String getVipHandlerStatus() {
        return vipHandlerStatus;
    }

    public void setVipHandlerStatus(String vipHandlerStatus) {
        this.vipHandlerStatus = vipHandlerStatus == null ? null : vipHandlerStatus.trim();
    }

    public Integer getVipUser() {
        return vipUser;
    }

    public void setVipUser(Integer vipUser) {
        this.vipUser = vipUser;
    }
}