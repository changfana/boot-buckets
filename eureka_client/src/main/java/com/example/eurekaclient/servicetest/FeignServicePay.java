package com.example.eurekaclient.servicetest;

import com.example.eurekaclient.service.impl.FeignPayFail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName FeignServicePay
 * @Description
 * @Author changfan
 * @Date 2019-6-27 13:43
 * @Version 1.0
 **/
@FeignClient(value = "eureka-pay",fallback = FeignPayFail.class)
public interface FeignServicePay {

    @RequestMapping(value = "/hello1")
    String PayHello();
}