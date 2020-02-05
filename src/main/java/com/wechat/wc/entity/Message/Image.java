package com.wechat.wc.entity.Message;

public class Image {

    private String MediaId;

    public Image(String mediaId) {
        MediaId = mediaId;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }
}
