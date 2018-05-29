package com.antiumbo.rabbitmqdemo;

import com.antiumbo.rabbitmqdemo.test.HelloSender;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RabbitmqDemoApplicationTests {
@Autowired
private HelloSender helloSender;
    @Test
    public void contextLoads() {
        helloSender.send();
    }

}
