package com.example.eureka_server;


import com.example.eureka_server.rabbitmp.RebbitMQProduction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MQTest {

    @Autowired
    private RebbitMQProduction rebbitMQProduction;

    @Test
    public void SendMessage(){
        rebbitMQProduction.SendMessage();
}
}
