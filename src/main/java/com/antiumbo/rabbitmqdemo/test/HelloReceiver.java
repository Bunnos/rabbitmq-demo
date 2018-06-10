package com.antiumbo.rabbitmqdemo.test;

import com.antiumbo.rabbitmqdemo.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
@Component
@RabbitListener(queues = RabbitConfig.queueName)
public class HelloReceiver {

    @RabbitHandler
    public void process(String hello) {
        System.out.println("Receiver :" + hello);
    }
}
