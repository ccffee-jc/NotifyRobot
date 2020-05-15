package com.ccffee.coolQHttpServer.Util;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.Map;

public class HttpUtil {

    public static Map postTuLing(String message, String userId) {
        //目标接口地址
        String url = "http://openapi.tuling123.com/openapi/api/v2";

        //请求参数JOSN类型
        HashMap data = new HashMap();
        data.put("reqType", 0);
        HashMap perception = new HashMap();
        HashMap inputText = new HashMap();
        inputText.put("text", message);
        perception.put("inputText", inputText);
        data.put("perception", perception);
        HashMap userInfo = new HashMap();
        userInfo.put("apiKey", "b7c3a3b7e2da48b7a2ff7ba922caba94");
        userInfo.put("userId", userId);
        data.put("userInfo", userInfo);

        JSONObject postData = (JSONObject) JSON.toJSON(data);
//        System.out.println(postData);

        RestTemplate client = new RestTemplate();

        String json = client.postForEntity(url, postData, String.class).getBody();

//        System.out.println(json);

        JSONObject resultJson = JSONObject.parseObject(json);
        Map resultMap = (Map) resultJson;

        return resultMap;
    }

}
