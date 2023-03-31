package com.example.intelligence.service;

import com.example.intelligence.Data.Data;

import java.util.List;

public interface DataService {
    int adddata(String id, String title, String content, String url, String yuanurl);

    List<Data> inquire();

    Data inquireabout(String id);

    String getLastId();
}
