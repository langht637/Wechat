package com.wechat.wc.entity;

public class AccessToken {

    private String AccessToken;
    private long expireTime;

    public AccessToken(String accessToken, String expireIn) {
        AccessToken = accessToken;
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


    public boolean isExpired(){
        return  System.currentTimeMillis()>expireTime;
    }
}
