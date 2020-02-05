package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wechat.wc.entity.Message.BaseMessage;
import com.wechat.wc.entity.Message.Music;

import java.util.Map;

@XStreamAlias("xml")
public class MusicMessage extends BaseMessage {

    private Music music;

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public MusicMessage(Map<String, String> requestMap, Music music) {
        super(requestMap);
        this.music = music;
        setMesType("music");
    }
}
