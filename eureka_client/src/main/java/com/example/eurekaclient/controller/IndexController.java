package com.example.eurekaclient.controller;

import com.example.eurekaclient.aopinvoke.service.CalculatorService;
import com.example.eurekaclient.service.FeignService;
import com.example.eurekaclient.servicetest.FeignServicePay;
import com.example.eurekaclient.util.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName IndexController
 * @Description
 * @Author changfan
 * @Date 2019-5-13 10:29
 * @Version 1.0
 **/
@RequestMapping(value = "/test")
@RestController
public class IndexController  {

   /* @Autowired
    calculatorServiceImpl2 calculatorServiceImpl2;*/

    @Autowired
    private CalculatorService calculatorService;

    @Autowired
    private FeignService feignService;
    @Autowired
    private FeignServicePay feignServicePay;


    @RequestMapping(value = "/changfan/{target}", method = RequestMethod.GET)
    public String hello(@PathVariable("target") String name) {
        String result = "";
        System.out.println("进来controller");
        result = feignServicePay.PayHello();
        result = result + feignService.hello1();
        return result;
    }

    @RequestMapping(value = "/changfanput", method = RequestMethod.GET)
    public int hello2() {

//        CalculatorService calculatorService2 = (CalculatorService) SpringUtil.getBean(calculatorServiceImpl.class);  //byClass获取cglib代理的bean
        CalculatorService calculatorService = (CalculatorService) SpringUtil.getBean("calculatorServiceImplAAA");  //byName获取cglib代理的bean

        return calculatorService.add(2,3);
    }

}