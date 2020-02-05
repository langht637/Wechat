package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.wechat.wc.entity.Message.BaseMessage;

import java.util.Map;

@XStreamAlias("xml")
public class VoiceMessage extends BaseMessage {

    private Voice Voice;

    public VoiceMessage(Map<String, String> requestMap,Voice voice) {
        super(requestMap);
        this.Voice = voice;
        this.setMesType("voice");
    }

    public com.wechat.wc.entity.Message.Voice getVoice() {
        return Voice;
    }

    public void setVoice(com.wechat.wc.entity.Message.Voice voice) {
        Voice = voice;
    }
}
