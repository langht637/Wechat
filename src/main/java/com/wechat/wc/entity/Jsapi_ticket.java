package com.wechat.wc.entity;

public class Jsapi_ticket {

    private String Ticket;
    private long expireTime;

    public Jsapi_ticket(String Ticket, String expireIn) {
        this.Ticket = Ticket;
        this.expireTime = System.currentTimeMillis()+Integer.parseInt(expireIn)*1000;
    }

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String ticket) {
        Ticket = ticket;
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
