package com.example.demo.util;


import java.util.*;
import org.json.JSONObject;
import com.baidu.aip.ocr.AipOcr;
public class Sample {


    public static void main(String[] args) {
        //设置APPID/AK/SK
         String APP_ID = "121880696";
         String API_KEY = "nIzU3iXuxRlvyPw5ZcqLAeHL";
         String SECRET_KEY = "mhV6x0cXbi62z5VOhJPvxKMYdsFK1YsG";
        // 初始化一个AipOcr
        AipOcr client = new AipOcr(APP_ID, API_KEY, SECRET_KEY);
        // 调用接口
        String path = "C:\\Users\\22924\\Desktop\\images\\reach.png";
        JSONObject res = client.basicGeneral(path, new HashMap<String, String>());
        System.out.println(res.toString(2));

    }
}
