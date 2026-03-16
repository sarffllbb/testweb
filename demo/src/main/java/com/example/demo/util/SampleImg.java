package com.example.demo.util;

import com.baidu.aip.imageclassify.AipImageClassify;
import org.json.JSONObject;

import java.util.HashMap;

public class SampleImg {


    public static void main(String[] args) {
    //设置APPID/AK/SK
    String APP_ID = "121881286";
    String API_KEY = "rm4pvUU0RAUyuf5KHfMIayQy";
    String SECRET_KEY = "rcHvs1nDUCJBjsA4DVmncrtswgy7AQsZ";

    // 初始化一个AipImageClassify
    AipImageClassify client = new AipImageClassify(APP_ID, API_KEY, SECRET_KEY);
    // 调用接口
    String path = "C:\\Users\\22924\\Desktop\\images\\dog.jpg";
    JSONObject res = client.advancedGeneral(path, new HashMap<String, String>());
    System.out.println(res.toString(2));

    }
}
