package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.Map;

@XStreamAlias("xml")
public class ImageMessage extends BaseMessage {
    private Image Image;

    public ImageMessage(Map<String, String> requestMap,Image image) {
        super(requestMap);
        this.setMesType("image");
        this.Image = image;
    }

    public com.wechat.wc.entity.Message.Image getImage() {
        return Image;
    }

    public void setImage(com.wechat.wc.entity.Message.Image image) {
        Image = image;
    }
}
