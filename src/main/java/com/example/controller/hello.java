package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/test")
public class hello {

    @RequestMapping("hello")
    @ResponseBody
    //主要是做jeanson转换
    public Map<String,Object> showHelloworld(){
        Map<String, Object> objectObjectHashMap = new HashMap<>();
        objectObjectHashMap.put("msg1","helloworld");
        objectObjectHashMap.put("msg2","zhongguoninhao");
        return objectObjectHashMap;

    }
}
