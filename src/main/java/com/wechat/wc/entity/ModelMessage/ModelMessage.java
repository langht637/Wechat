package com.wechat.wc.entity.ModelMessage;

public class ModelMessage {

    private String touser;
    private String template_id;
    private String url;
    private String miniprogram;
    private ModelData data;

    public ModelMessage(String touser, String template_id, ModelData data) {
        this.touser = touser;
        this.template_id = template_id;
        this.data = data;
    }

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(String miniprogram) {
        this.miniprogram = miniprogram;
    }

    public ModelData getData() {
        return data;
    }

    public void setData(ModelData data) {
        this.data = data;
    }
}
