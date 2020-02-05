package com.wechat.wc.entity.Message;




public class Voice {

    private String MediaId;

    public Voice(String mediaId) {
        MediaId = mediaId;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
