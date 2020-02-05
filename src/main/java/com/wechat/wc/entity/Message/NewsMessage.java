package com.wechat.wc.entity.Message;

import com.thoughtworks.xstream.annotations.XStreamAlias;

import java.util.List;
import java.util.Map;

@XStreamAlias("xml")
public class NewsMessage extends BaseMessage {

    private String ArticleCount;
    private List<Article> Articles;

    public NewsMessage(Map<String, String> requestMap, List<Article> articles) {
        super(requestMap);
        ArticleCount = articles.size()+"";
        Articles = articles;
        setMesType("news");
    }

    public String getArticleCount() {
        return ArticleCount;
    }

    public void setArticleCount(String articleCount) {
        ArticleCount = articleCount;
    }

    public List<Article> getArticles() {
        return Articles;
    }

    public void setArticles(List<Article> articles) {
        Articles = articles;
    }
}
