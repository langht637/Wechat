package com.wechat.wc.entity.Button;

import com.wechat.wc.entity.Button.Button;

import java.util.ArrayList;
import java.util.List;

public class Menu {

    private List<Button> button = new ArrayList<Button>();

    public List<Button> getButton() {
        return button;
    }

    public void setButton(List<Button> button) {
        this.button = button;
    }

}
