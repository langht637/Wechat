package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wechat.wc.entity.Message.BaseMessage;

import java.util.Map;

@XStreamAlias("xml")
public class VideoMessage extends BaseMessage {

    private Video Video;


    public VideoMessage(Map<String, String> requestMap, Video video) {
        super(requestMap);
        this.Video = video;
        this.setMesType("video");
    }

    public com.wechat.wc.entity.Message.Video getVideo() {
        return Video;
    }

    public void setVideo(com.wechat.wc.entity.Message.Video video) {
        Video = video;
    }


}
