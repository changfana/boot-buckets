package com.example.eureka_server.rabbitmp;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;

@Component
@RabbitListener(queues = "topic.message")
public class MQConsumption {

    @RabbitHandler
    public static void consumption(String content){
        try {
            File file = new File("/aaa.txt");
            OutputStream outputStream = new FileOutputStream(file);
            System.out.println("消费者队列UserQuence接收的数据为："+content);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
