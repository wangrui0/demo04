package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

@RestController
public class FileUploadController {

    @RequestMapping (value="/fileuploadcontroller",method= RequestMethod.POST)
    public Map<String, Object> fileupload(@RequestParam(name="filename") MultipartFile filename) throws Exception {
        System.out.println(filename.getOriginalFilename());
        filename.transferTo(new File("/Users/wangrui/Documents/java kuangjia /demo03/src/main/resources/static"+filename.getOriginalFilename()));
        Map<String, Object> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }

}
