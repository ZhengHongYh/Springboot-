package test;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import kong.unirest.HttpResponse;
import kong.unirest.Unirest;
import org.junit.jupiter.api.Test;
import java.io.IOException;

public class test {

    @Test
    public void setResponse() throws IOException {

        HttpResponse<String> response = Unirest.get("http://new.xianbao.fun/plus/json/push.txt").asString();
        String substring = response.getBody();
        System.out.println(substring);
        JSONArray jsonArray = JSONArray.parseArray((String) substring);
        JSONObject jsonObject = jsonArray.getJSONObject(0);
        System.out.println(jsonObject.getString("id"));

//        for (int i = 9; i >=0; i--) {
//            JSONObject jsonObject = jsonArray.getJSONObject(i);
//            String id= jsonObject.getString("id");
//            String title= jsonObject.getString("title");
//            String content= jsonObject.getString("content");
//            String url= jsonObject.getString("url");
//            String yuanurl= jsonObject.getString("yuanurl");
//            System.out.println(id);
//        }




//        Object objJson = JSONObject.fromObject(substring);

//        JSONArray id = (JSONArray) jsonArray.get("id");
//        System.out.println(id);
//            System.out.println( ((JSONObject) objJson).getString("title"));
//            System.out.println( ((JSONObject) objJson).getString("content"));
//            System.out.println( ((JSONObject) objJson).getString("url"));
//            System.out.println( ((JSONObject) objJson).getString("yuanurl"));
//        System.out.println(objJson.getClass().toString());




    }
}
