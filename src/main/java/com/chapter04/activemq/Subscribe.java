package com.chapter04.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Subscribe
{
    @Autowired
    private JmsTemplate jmsTemplate;

    @JmsListener(destination = "springboot.test.topic")
    public void subscribeMessage(String message)
    {
        log.info("订阅消息--------->"+message);
    }
}
