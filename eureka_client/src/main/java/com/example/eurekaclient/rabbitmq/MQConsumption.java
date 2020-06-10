package com.example.eurekaclient.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "UserQuence")
public class MQConsumption {
    @RabbitHandler
    public static void consumption(String content){
        System.out.println("消费者接收的数据为："+content);
    }
}
