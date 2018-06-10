package com.antiumbo.rabbitmqdemo.test;

import com.antiumbo.rabbitmqdemo.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
@Component
public class HelloSender {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send() {
        String context = "hello" + new Date();
        System.out.println("Sender :" + context);
        this.rabbitTemplate.convertAndSend(RabbitConfig.queueName, context);
    }
}
