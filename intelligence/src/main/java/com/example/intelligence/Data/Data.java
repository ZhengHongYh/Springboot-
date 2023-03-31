package com.example.intelligence.Data;

import jakarta.persistence.*;

@Table(name = "data")
@Entity
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String title;
    private String content;
    private String url;
    private String yuanurl;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getYuanurl() {
        return yuanurl;
    }

    public void setYuanurl(String yuanurl) {
        this.yuanurl = yuanurl;
    }

    @Override
    public String toString() {
        return "data{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", url='" + url + '\'' +
                ", yuanurl='" + yuanurl + '\'' +
                '}';
    }
}
