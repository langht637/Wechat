package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;

@XStreamAlias("xml")
public class BaseMessage {

    private String ToUserName;
    private String FromUserName	;
    private String CreateTime;
    private String MsgType;

    public BaseMessage(Map<String,String> requestMap){
        this.FromUserName = requestMap.get("ToUserName");
        this.ToUserName = requestMap.get("FromUserName");
        this.CreateTime = System.currentTimeMillis()/1000+"";
    }

    @Override
    public String toString() {
        return "BaseMessage{" +
                "ToUserName='" + ToUserName + '\'' +
                ", FromUserName='" + FromUserName + '\'' +
                ", CreateTime='" + CreateTime + '\'' +
                ", MsgType='" + MsgType + '\'' +
                '}';
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public void setCreateTime(String createTime) {
        CreateTime = createTime;
    }


    public String getToUserName() {

        return ToUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public String getCreateTime() {
        return CreateTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMesType(String MsgType){
        this.MsgType = MsgType;
    }

}
