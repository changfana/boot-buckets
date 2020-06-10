package com.example.eurekaclient.service.impl;

import com.example.eurekaclient.service.FeignService;
import org.springframework.stereotype.Component;

/**
 * @ClassName FeignServerFail
 * @Description
 * @Author changfan
 * @Date 2019-7-1 11:40
 * @Version 1.0
 **/
@Component
public class FeignServerFail implements FeignService {

    @Override
    public String hello1() {
        return "抱歉EurekaServer，服务器访问中断了！";
    }

    @Override
    public String hell2() {
        return null;
    }

    @Override
    public String hello3() {
        return null;
    }

    @Override
    public String hello4() {
        return null;
    }
}