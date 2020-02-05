package com.wechat.wc.entity.Button;

public class ViewButton extends Button {

    private String type;
    private String url;

    public ViewButton(String name,String url) {
        super(name);
        this.type = "view";
        this.url = url;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
