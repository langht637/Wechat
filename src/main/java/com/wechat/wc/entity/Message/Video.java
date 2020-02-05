package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;


public class Video {

    private String MediaId;
    private String Title;
    private String Description;

    public Video(String mediaId) {
        MediaId = mediaId;
    }

    public String getMediaId() {
        return MediaId;
    }

    public void setMediaId(String mediaId) {
        MediaId = mediaId;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    @Override
    public String toString() {
        return "Video{" +
                "MediaId='" + MediaId + '\'' +
                ", Title='" + Title + '\'' +
                ", Description='" + Description + '\'' +
                '}';
    }
}
