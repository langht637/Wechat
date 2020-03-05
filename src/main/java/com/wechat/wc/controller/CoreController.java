package com.wechat.wc.controller;


import com.wechat.wc.entity.WebAccessToken;
import com.wechat.wc.service.Wxservlet;
import com.wechat.wc.util.SignUtil;
import com.wechat.wc.util.UrlUtil;
import com.wechat.wc.util.Wxservlet;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;


@RestController
public class CoreController {
    //增加日志
    private static Logger log = LoggerFactory.getLogger(CoreController.class);
    //验证是否来自微信服务器的消息
    @RequestMapping(value = "wc",method = RequestMethod.GET)
    public String checkSignature(@RequestParam(name = "signature" ,required = false) String signature  ,
                                 @RequestParam(name = "nonce",required = false) String  nonce ,
                                 @RequestParam(name = "timestamp",required = false) String  timestamp ,
                                 @RequestParam(name = "echostr",required = false) String  echostr){
        // 通过检验signature对请求进行校验，若校验成功则原样返回echostr，表示接入成功，否则接入失败
        if (SignUtil.checkSignature(signature, timestamp, nonce)) {
            log.info("接入成功");
            return echostr;
        }
        log.error("接入失败");
        log.error("接入失败");
        log.error("接入失败");
        log.error("接入失败");
        log.error("接入失败");
        return "";
    }

    @RequestMapping(value = "wc", method = RequestMethod.POST)
    public void post(HttpServletRequest req, HttpServletResponse res) throws IOException {
        req.setCharacterEncoding("UTF-8");
        res.setCharacterEncoding("UTF-8");
        Map<String,String> map =Wxservlet.getRequest(req.getInputStream());
        String respXml = Wxservlet.getResponse(map);
        System.out.print(respXml);
        PrintWriter writer = res.getWriter();
        writer.print(respXml);
        writer.flush();
        writer.close();
    }


    @RequestMapping(value = "WebConfirm", method = RequestMethod.GET)
    public ModelAndView test(String code){
        WebAccessToken Wb = Wxservlet.getWebAccessToken(code);
        String url = "https://api.weixin.qq.com/sns/userinfo?access_token=ACCESS_TOKEN&openid=OPENID&lang=zh_CN".replace("ACCESS_TOKEN",Wb.getAccessToken()).replace("OPENID",Wb.getOpenID());
        System.out.print(UrlUtil.get(url));
        return new ModelAndView("test");
    }





}