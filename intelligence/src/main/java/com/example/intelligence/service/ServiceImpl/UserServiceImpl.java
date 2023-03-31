package com.example.intelligence.service.ServiceImpl;

import com.example.intelligence.Data.Data;
import com.example.intelligence.repository.DataDao;
import com.example.intelligence.service.DataService;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements DataService {
    @Resource
    @Autowired
    private DataDao dataDao;


    @Override
    public int adddata(String id, String title, String content, String url, String yuanurl) {
        int data = dataDao.findUserswithoutgender(id,title,content,url,yuanurl);
        return data;
    }

    @Override
    public List<Data> inquire() {
        List<Data> data=dataDao.inquire();
        return data;
    }

    @Override
    public Data inquireabout(String id) {
        Data data=dataDao.inquireabout(id);
        return data;
    }

    @Override
    public String getLastId() {
        String data=dataDao.getLastId();
        return data;
    }
}
