package com.wechat.wc.entity.ModelMessage;

public class ModelData {

    private KeyWord first;
    private KeyWord key1;
    private KeyWord key2;
    private KeyWord key3;
    private KeyWord remark;

    public ModelData(KeyWord first, KeyWord key1, KeyWord key2, KeyWord key3, KeyWord remark) {
        this.first = first;
        this.key1 = key1;
        this.key2 = key2;
        this.key3 = key3;
        this.remark = remark;
    }

    public KeyWord getFirst() {
        return first;
    }

    public void setFirst(KeyWord first) {
        this.first = first;
    }

    public KeyWord getKey1() {
        return key1;
    }

    public void setKey1(KeyWord key1) {
        this.key1 = key1;
    }

    public KeyWord getKey2() {
        return key2;
    }

    public void setKey2(KeyWord key2) {
        this.key2 = key2;
    }

    public KeyWord getKey3() {
        return key3;
    }

    public void setKey3(KeyWord key3) {
        this.key3 = key3;
    }

    public KeyWord getRemark() {
        return remark;
    }

    public void setRemark(KeyWord remark) {
        this.remark = remark;
    }
}
