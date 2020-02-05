package com.wechat.wc.util;

import com.alibaba.fastjson.JSON;
import com.wechat.wc.entity.Button.*;
import com.wechat.wc.entity.Message.Video;
import com.wechat.wc.entity.Message.VideoMessage;
import org.junit.Test;

import java.util.HashMap;

public class WxservletTest {

    @Test
    public void getAccessToken() {
        System.out.print(Wxservlet.getAccessToken()+"\n");
        System.out.print(Wxservlet.getAccessToken());
    }

    @Test
    public void testButton(){
        Menu menu = new Menu();
        SubButton sub_button = new SubButton("菜单");
        menu.getButton().add(new ClickButton("123","abc"));
        sub_button.getSub_button().add(new ClickButton("123","abc"));
        sub_button.getSub_button().add(new ViewButton("123","http://www.soso.com/"));
        menu.getButton().add(sub_button);
        String json = JSON.toJSONString(menu);
        System.out.print(json);
        String url = "https://api.weixin.qq.com/cgi-bin/menu/create?access_token=ACCESS_TOKEN";
        url = url.replace("ACCESS_TOKEN",Wxservlet.getAccessToken());
        String result = UrlUtil.post(url,json);
        System.out.print(result);
    }

    @Test
    public void testxml(){
        HashMap map = new HashMap();
        map.put("ToUserName","Name");
        map.put("FromUserName","NameName");
        Video v = new Video("123");
        VideoMessage ms = new VideoMessage(map,v);
        System.out.print(Wxservlet.beantoXml(ms));
    }


}