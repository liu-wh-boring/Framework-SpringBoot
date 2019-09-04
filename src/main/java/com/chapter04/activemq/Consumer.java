package com.chapter04.activemq;

import lombok.extern.slf4j.Slf4j;
import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Consumer
{
    @JmsListener(destination = "springboot.test.queue")
    public void receive(String message)
    {
        log.info("接受的消息"+message);
    }
}
