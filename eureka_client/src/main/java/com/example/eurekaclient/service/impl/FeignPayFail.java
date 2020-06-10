package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.servicetest.FeignServicePay;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignPayFail
 * @Description
 * @Author changfan
 * @Date 2019-6-28 11:04
 * @Version 1.0
 **/
//@EnableHystrix
@Component
public class FeignPayFail implements FeignServicePay {
    @Override
    public String PayHello() {
        return "EurekaPay抱歉，服务器访问中断了！";
    }
}