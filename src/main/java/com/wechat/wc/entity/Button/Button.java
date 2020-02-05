package com.wechat.wc.entity.Button;

public class Button {

    private String name;//所有一级，二级菜单的属性

    public Button(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
