package com.example.eurekaclient.aopinvoke.util;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @ClassName InvokeUtil
 * @Description
 * @Author changfan
 * @Date 2019-7-9 15:47
 * @Version 1.0
 **/
@Aspect
@Component
public class InvokeUtil {

     /**
      现在想在实现类中的每个方法执行前、后、以及是否发生异常等信息打印出来，需要把日志信息抽取出来，写到对应的切面的类中 LoggingAspect.java 中
      要想把一个类变成切面类，需要两步，
      ① 在类上使用 @Component 注解 把切面类加入到IOC容器中
      ② 在类上使用 @Aspect 注解 使之成为切面类
     */

    /**
     * @Desc  前置通知：目标方法执行之前执行以下方法体的内容
     * @param jp
     */
    @Before("execution(* com.example.eurekaclient.aopinvoke.*.*.*.*(..))")
    public void beforeMethod(JoinPoint jp){
        String methodName = jp.getSignature().getName();
        System.out.println("【前置通知】the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
    }

    /**
     * @Desc  返回通知：目标方法正常执行完毕时执行以下代码
     * @param jp
     * @param result
     */
    @AfterReturning(value = "execution(* com.example.eurekaclient.aopinvoke.*.*.*.*(..))",returning = "result")
    private void   afterReturningMethod(JoinPoint jp,Object result){
        String methodName =jp.getSignature().getName();
        System.out.println("【返回通知】the method 【" + methodName + "】 ends with 【" + result + "】");
    }

    /**
     * @Desc  后置通知：目标方法执行之后执行以下方法体的内容，不管是否发生异常。
     * @param jp
     */
    @After("execution(* com.example.eurekaclient.aopinvoke.*.*.*.*(..))")
    public void afterMethod(JoinPoint jp) throws Exception{
        System.out.println("【后置通知】this is a afterMethod advice...");
    } 


    /**
     * @Desc 异常通知：目标方法发生异常的时候执行以下代码
     * @param jp
     * @param e
     */
    @AfterThrowing(value = "execution(* com.example.eurekaclient.aopinvoke.*.*.*.*(..))",throwing = "e")
    private void afterThrowingMethod(JoinPoint jp,NullPointerException e){
        String methodName = jp.getSignature().getName();
        System.out.println("【异常通知】the method 【" + methodName + "】 occurs exception: " + e);
    }


    /**
     * @Desc  环绕通知：目标方法执行前后分别执行一些代码，发生异常的时候执行另外一些代码
     * @return
     */
    @Around(value = "execution(* com.example.eurekaclient.aopinvoke.*.*.*.*(..))")
    private Object aroundMethod(ProceedingJoinPoint jp){
        String methodName = jp.getSignature().getName();
        Object result = null;
        try {
            System.out.println("【环绕通知中的--->前置通知】：the method 【" + methodName + "】 begins with " + Arrays.asList(jp.getArgs()));
            //执行目标方法
            result = jp.proceed();
            System.out.println("【环绕通知中的--->返回通知】：the method 【" + methodName + "】 ends with " + result);
        } catch (Throwable e) {
            System.out.println("【环绕通知中的--->异常通知】：the method 【" + methodName + "】 occurs exception " + e);
        }

        System.out.println("【环绕通知中的--->后置通知】：-----------------end.----------------------");
        return result;
    }
}