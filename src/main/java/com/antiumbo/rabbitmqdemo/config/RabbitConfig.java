package com.antiumbo.rabbitmqdemo.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author antiumbo
 * @date on 2018/5/29
 **/
@Configuration
public class RabbitConfig {

    @Bean
    public Queue queue(){
        return new Queue("hello");
    }
}
