package com.wechat.wc.util;

import com.alibaba.fastjson.JSONObject;
import com.thoughtworks.xstream.XStream;
import com.wechat.wc.entity.*;
import com.wechat.wc.entity.Message.*;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Wxservlet {

    private static final String Get_Ticket_URL = "https://api.weixin.qq.com/cgi-bin/ticket/getticket?access_token=ACCESS_TOKEN&type=jsapi";
    private static final String Get_Token_URL = "https://api.weixin.qq.com/cgi-bin/token?grant_type=client_credential&appid=APPID&secret=APPSECRET";
    private static final String Get_WebToken_URL ="https://api.weixin.qq.com/sns/oauth2/access_token?appid=APPID&secret=SECRET&code=CODE&grant_type=authorization_code";
    private static final String APPID = "wxb7418828e2f36448";
    private static final String APPSECRET = "54ef3070f4639796a5014a88fed31c97";

    private static AccessToken at;
    private static WebAccessToken Webat;
    private static Jsapi_ticket ti;

    private static void getTicket(){
        String url = Get_Ticket_URL.replace("ACCESS_TOKEN",getAccessToken());
        String ticketStr = UrlUtil.get(url);
        JSONObject json = JSONObject.parseObject(ticketStr);
        String ticket = json.getString("ticket");
        String expirein = json.getString("expires_in");
        ti = new Jsapi_ticket(ticket,expirein);
    }

    public static String getJsapi_ticket(){
        if(ti==null||ti.isExpired()){
            getTicket();
        }
        return ti.getTicket();
    }


    private static void getWebToken(String code){
        String url = Get_WebToken_URL.replace("APPID",APPID).replace("SECRET",APPSECRET).replace("CODE",code);
        String tokenStr = UrlUtil.get(url);
        JSONObject json = JSONObject.parseObject(tokenStr);
        String token = json.getString("access_token");
        String expirein = json.getString("expires_in");
        String openid = json.getString("openid");
        Webat = new WebAccessToken(token,expirein,openid);
    }

    public static WebAccessToken getWebAccessToken(String code){
        if(Webat==null||Webat.isExpired()){
            getWebToken(code);
        }
        return Webat;
    }

    private static void getToken(){
        String url = Get_Token_URL.replace("APPID",APPID).replace("APPSECRET",APPSECRET);
        String tokenStr = UrlUtil.get(url);
        JSONObject json = JSONObject.parseObject(tokenStr);
        String token = json.getString("access_token");
        String expirein = json.getString("expires_in");
        at = new AccessToken(token,expirein);
    }

    public static String getAccessToken(){
        if(at==null||at.isExpired()){
            getToken();
        }
        return at.getAccessToken();
    }



    public static Map<String,String> getRequest(InputStream is){
        Map<String,String> map = new HashMap<String,String>();
        // 读取输入流
        SAXReader reader = new SAXReader();
        Document document = null;
        try {
            document = reader.read(is);
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        // 得到xml根元素
        Element root = document.getRootElement();
        // 得到根元素的所有子节点
        List<Element> elementList = root.elements();
        // 遍历所有子节点
        for (Element e : elementList)
            map.put(e.getName(), e.getStringValue());

        return map;
    }

    public static String getResponse(Map<String,String> requestMap){
        BaseMessage msg = null;
        String MsgType = requestMap.get("MsgType");
        switch (MsgType){
            case "text":
                msg = MessageProcess.dealTextMessage(requestMap);
                break;
            case "image":
                msg = MessageProcess.dealImageMessage(requestMap);
                break;
            case "voice":
                msg = MessageProcess.dealVoiceMessage(requestMap);
                break;
            case "vedio":
                msg = MessageProcess.dealVedioMessage(requestMap);
                break;
            case "shortvedio":
                msg = MessageProcess.dealshortvedioMessage(requestMap);
                break;
            case "event":
                msg = MessageProcess.dealEvent(requestMap);
                break;
        }

        return beantoXml(msg);
    }




    public static String beantoXml(BaseMessage msg) {
        XStream stream = new XStream();
        stream.processAnnotations(BaseMessage.class);
        stream.processAnnotations(ImageMessage.class);
        stream.processAnnotations(MusicMessage.class);
        stream.processAnnotations(NewsMessage.class);
        stream.processAnnotations(TextMessage.class);
        stream.processAnnotations(VideoMessage.class);
        stream.processAnnotations(VoiceMessage.class);
        String xml = stream.toXML(msg);
        return xml;

    }



}
