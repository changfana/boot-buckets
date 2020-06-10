package com.example.eurekaclient.service;


import com.example.eurekaclient.service.impl.FeignServerFail;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @ClassName FeignService
 * @Description
 * @Author changfan
 * @Date 2019-5-23 11:08
 * @Version 1.0
 **/
@FeignClient(value = "eureka-server",fallback = FeignServerFail.class)
public interface FeignService {

    //查询select
    @RequestMapping(value = "/hello1",method = RequestMethod.GET)
    String hello1();

    //修改update
    @RequestMapping(value = "/hello2",method = RequestMethod.PUT)
    String hell2();

    //删除delete
    @RequestMapping(value = "hello3",method = RequestMethod.DELETE)
    String hello3();

    //新增insert
    @RequestMapping(value = "hello4",method = RequestMethod.POST)
    String hello4();
}