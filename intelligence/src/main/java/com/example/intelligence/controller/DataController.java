package com.example.intelligence.controller;

import com.example.intelligence.Data.Data;
import com.example.intelligence.service.DataService;
import jakarta.annotation.Resource;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import com.alibaba.fastjson.JSONArray;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSONObject;
import java.util.List;

@RestController
@RequestMapping("/user")
public class DataController {
    @Resource
    private DataService dataService;

    @PostMapping("/data")
    public boolean insertdata(@RequestBody Data newData){
        String id = newData.getId();
        String title = newData.getTitle();
        String content = newData.getContent();
        String url = newData.getUrl();
        String yuanurl = newData.getYuanurl();
        int data = dataService.adddata( id, title, content, url, yuanurl);
        return true;
    }

    @GetMapping("/inquire")
    public List<Data> inquire(){
        List<Data> data=dataService.inquire();
        return data;
    }

    @PostMapping("/inquireabout")
    public Data inquireabout(@RequestBody Data newData){
        String id = newData.getId();
        Data data=dataService.inquireabout(id);
        return data;
    }

    @Scheduled(cron = "0/15 * * * * ? ")
    public void Datawarehousing(){
        HttpResponse<String> response = Unirest.get("http://new.xianbao.fun/plus/json/push.txt").asString();
        String substring = response.getBody();
        JSONArray jsonArray = JSONArray.parseArray(substring);
        int num= Integer.parseInt(dataService.getLastId());
        for (int i = 9; i >=0; i--) {
            JSONObject jsonObject = jsonArray.getJSONObject(i);
            String id= jsonObject.getString("id");
            String title= jsonObject.getString("title");
            String content= jsonObject.getString("content");
            String url= jsonObject.getString("url");
            String yuanurl= jsonObject.getString("yuanurl");
            if (Integer.parseInt(id) > num) {
                dataService.adddata( id, title, content, url, yuanurl);
                System.out.println(id);
            }

        }

    }
}
