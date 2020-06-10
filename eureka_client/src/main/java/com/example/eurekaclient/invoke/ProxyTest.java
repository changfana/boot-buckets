package com.example.eurekaclient.invoke;

import com.example.eurekaclient.aopinvoke.service.CalculatorService;
import com.example.eurekaclient.aopinvoke.service.impl.calculatorServiceImpl;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName Proxy
 * @Description
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 * @Author changfan
 * @Date 2019-7-18 11:32
 * @Version 1.0
 **/
public class ProxyTest implements InvocationHandler {

    private Object target;

    public  ProxyTest(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始嗨皮的代理模式..");
        Object object=method.invoke(target,args);
        System.out.println(object);
        System.out.println("代理完成..");
        return object;
    }


    public  Object CreateProxyObject(){

        return Proxy.newProxyInstance(ProxyTest.class.getClassLoader(),target.getClass().getInterfaces(),this);
    }


    public static void main(String[] args) {
          CalculatorService calculatorService = new calculatorServiceImpl();
          ProxyTest proxyTest = new ProxyTest(calculatorService);
          Object object=proxyTest.CreateProxyObject();
          CalculatorService service =(CalculatorService) object;
          service.add(2,3);
//          Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),calculatorService.getClass().getInterfaces(),this);
        }
}