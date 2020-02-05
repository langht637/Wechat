package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wechat.wc.entity.Message.BaseMessage;

import java.util.Map;

@XStreamAlias("xml")
public class TextMessage extends BaseMessage {

    private String Content;

    public TextMessage(Map<String,String> requestMap, String Content){
        super(requestMap);
        this.Content = Content;
        this.setMesType("text");
    }

    public void setContent(String content) {
        this.Content = content;
    }

    public String getContent() {
        return Content;
    }


    @Override
    public String toString() {
        return "TextMessage{" +
                "content='" + Content + '\'' +
                '}';
    }

}
