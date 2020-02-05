package com.wechat.wc.entity.Button;

import com.wechat.wc.entity.Button.Button;

public class ClickButton extends Button {

    private String type;
    private String key;

    public ClickButton(String name,String key) {
        super(name);
        this.key = key;
        this.type = "click";
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

}
