package com.example.pay_boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author changfan
 * @Date 2019-6-27 11:24
 * @Version 1.0
 **/
@RestController
public class IndexController {

    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    public String hello1(){
        return "这个pay_boot的支付方法";
    }
}