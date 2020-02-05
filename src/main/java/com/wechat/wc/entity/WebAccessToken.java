package com.wechat.wc.entity;

public class WebAccessToken {

    private String AccessToken;
    private long expireTime;
    private String OpenID;

    public WebAccessToken(String accessToken, String expireIn,String OpenID) {
        AccessToken = accessToken;
        this.OpenID = OpenID;
        this.expireTime = System.currentTimeMillis()+Integer.parseInt(expireIn)*1000;
    }

    public String getAccessToken() {
        return AccessToken;
    }

    public void setAccessToken(String accessToken) {
        AccessToken = accessToken;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public String getOpenID() {
        return OpenID;
    }

    public void setOpenID(String openID) {
        OpenID = openID;
    }

    public boolean isExpired(){
        return  System.currentTimeMillis()>expireTime;
    }
}
