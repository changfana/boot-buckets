package com.example.eurekaclient.aopinvoke.service.impl;

import com.example.eurekaclient.aopinvoke.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName calculatorServiceImpl
 * @Description
 * @Author changfan
 * @Date 2019-7-9 14:54
 * @Version 1.0
 **/
@Component("calculatorServiceImplAAA")
public class calculatorServiceImpl implements CalculatorService {

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int sub(int a, int b) {
        return a-b;
    }

    @Override
    public int mul(int a, int b) {
        return a*b;
    }

    @Override
    public int div(int a, int b) {
        return a/b;
    }






}