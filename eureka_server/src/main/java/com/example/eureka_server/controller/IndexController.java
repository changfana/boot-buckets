package com.example.eureka_server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName IndexController
 * @Description
 * @Author changfan
 * @Date 2019-5-13 10:17
 * @Version 1.0
 **/
@RestController
public class IndexController {


    @RequestMapping(value = "/test/{target}",method = RequestMethod.GET)
    public String hello(@PathVariable(value = "target")String aa){
           return aa+":hello word";
    }

    @RequestMapping("/test/{target}")
    public String hello2(@PathVariable("target")String aa){
        return aa+"hello word";
    }


    @RequestMapping(value = "/hello1")
    public String hello1(){
        return "这个hello1:4444的方法";
    }

    @RequestMapping(value = "/hello2")
    public String hello2(){
        return "这个hello2的方法";
    }

    @RequestMapping(value = "/hello3")
    public String hello3(){
        return "这个hello3的方法";
    }
}