package com.wechat.wc.entity.Button;

import com.wechat.wc.entity.Button.Button;

import java.util.ArrayList;
import java.util.List;

public class SubButton extends Button {

    private List<Button> sub_button = new ArrayList<Button>();


    public SubButton(String name) {
        super(name);
    }

    public List<Button> getSub_button() {
        return sub_button;
    }

    public void setSub_button(List<Button> sub_button) {
        this.sub_button = sub_button;
    }
}

