package com.example.eureka_server.rabbitmp;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class RebbitMQProduction {
      @Autowired
    private  AmqpTemplate amqpTemplate;

      public void SendMessage(){
          String content = "交换机名称为topic.Message，时间为："+new Date();
          String content2 = "交换机名称为topic.Messages，时间为："+new Date();
          amqpTemplate.convertAndSend("exchange","topic.message",content);
          amqpTemplate.convertAndSend("exchange","topic.messages",content2);
      }


}


