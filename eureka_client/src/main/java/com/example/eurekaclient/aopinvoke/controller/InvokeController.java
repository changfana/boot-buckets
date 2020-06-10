package com.example.eurekaclient.aopinvoke.controller;

import com.example.eurekaclient.aopinvoke.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @ClassName InvokeController
 * @Description
 * @Author changfan
 * @Date 2019-7-9 14:46
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/invoke")
public class InvokeController {

    @Autowired
    CalculatorService calculatorService;

    @RequestMapping(value = "/test",method = {RequestMethod.GET,RequestMethod.POST})
    public String invokeMethod(HttpServletRequest request, HttpServletResponse response){

        return String.valueOf(calculatorService.add(1,1));
    }
}