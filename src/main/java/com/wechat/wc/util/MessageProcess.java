package com.wechat.wc.util;

import com.wechat.wc.entity.Message.Article;
import com.wechat.wc.entity.Message.BaseMessage;
import com.wechat.wc.entity.Message.NewsMessage;
import com.wechat.wc.entity.Message.TextMessage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MessageProcess {

    public static BaseMessage dealEvent(Map<String,String> requestMap) {
        String event = requestMap.get("Event");
        switch (event){
            case "CLICK":
                return dealCLICK(requestMap);
            case "VIEW":
                return dealVIEW(requestMap);
        }
        return null;
    }

    private static BaseMessage dealVIEW(Map<String,String> requestMap) {
        String eventKey = requestMap.get("EventKey");
        switch (eventKey){
            case "abc":

        }
        return null;
    }

    private static BaseMessage dealCLICK(Map<String,String> requestMap) {
        String eventKey = requestMap.get("EventKey");
        switch (eventKey){
            case "abc":
                return new TextMessage(requestMap,"傻逼");
        }
        return null;
    }

    public static BaseMessage dealTextMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }

    public static BaseMessage dealImageMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }

    public static BaseMessage dealVoiceMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }

    public static BaseMessage dealVedioMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }

    public static BaseMessage dealshortvedioMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }

    public static BaseMessage dealEventMessage(Map<String, String> requestMap) {
        NewsMessage message = null;
        if(requestMap.get("Content").equals("图文")){
            List<Article> list = new ArrayList<Article>();
            list.add(new Article("傻逼","傻逼2","傻逼三","http://lang.vipgz2.idcfengye.com/WebConfirm"));
            message = new NewsMessage(requestMap,list);
        }
        return message;
    }
}
