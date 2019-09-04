package com.chapter04.activemq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Component;

import javax.jms.Destination;

@Component
public class Publish
{
    @Autowired
    private JmsTemplate jmsTemplate;

    public void publishMessage(Destination destination,String message)
    {
        this.jmsTemplate.convertAndSend(destination,message);
    }

}
