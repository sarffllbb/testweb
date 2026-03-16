package com.example.demo.util;

import com.baidu.aip.nlp.AipNlp;
import org.json.JSONObject;

public class SampleNLP {


    public static void main(String[] args) {
        //设置APPID/AK/SK
         String APP_ID = "121883975";
         String API_KEY = "FIXG02MVrOKJVeA8gwL0Gpa8";
         String SECRET_KEY = "OamY8uLfdT7NZcdtGWyWfGGLszBeDC2U";
        // 初始化一个AipNlp
        AipNlp client = new AipNlp(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String text = "百度是一家人工只能公司";
        JSONObject res = client.ecnet(text, null);
        System.out.println(res.toString(2));

    }
}
