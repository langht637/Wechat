package com.wechat.wc.util;

import com.alibaba.fastjson.JSON;
import com.wechat.wc.entity.ModelMessage.KeyWord;
import com.wechat.wc.entity.ModelMessage.ModelData;
import com.wechat.wc.entity.ModelMessage.ModelMessage;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlUtil {

    public static String get(String url){
        try {
            URL Urlobj = new URL(url);
            URLConnection conn = Urlobj.openConnection();
            InputStream in = conn.getInputStream();
            byte[] b = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while((len=in.read(b))!=-1){
                sb.append(new String(b,0,len));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static String post(String url,String data){
        try {
            URL Urlobj = new URL(url);
            URLConnection conn = Urlobj.openConnection();
            conn.setDoOutput(true);
            OutputStream os = conn.getOutputStream();
            os.write(data.getBytes());
            os.close();

            InputStream in = conn.getInputStream();
            byte[] b = new byte[1024];
            int len;
            StringBuilder sb = new StringBuilder();
            while((len=in.read(b))!=-1){
                sb.append(new String(b,0,len));
            }
            return sb.toString();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void send(){
        String u = "https://api.weixin.qq.com/cgi-bin/message/template/send?access_token=ACCESS_TOKEN";
        String url = u.replace("ACCESS_TOKEN",Wxservlet.getAccessToken());
        ModelData modelData = new ModelData(new KeyWord("恭喜你购买成功！","#173177"),new KeyWord("巧克力","#173177"),new KeyWord("39.8元","#173177"),new KeyWord("2014年9月22日","#173177"),new KeyWord("shabi","#173177"));
        ModelMessage modelMessage = new ModelMessage("o2-k1weOjzd7m4LQcDu1zvwDrLBY","u6-q-1JJ2Y98anGnORUZbnFOsUloaZnzZ4-7IOJwoUw",modelData);
        String json = JSON.toJSONString(modelMessage);
        System.out.print(json);
        System.out.print(post(url,json));

    }


}
