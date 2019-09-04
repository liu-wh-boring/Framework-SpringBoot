package com.chapter04.activemq;

import lombok.extern.slf4j.Slf4j;
import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.BeansException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import javax.jms.Destination;

@Slf4j
@SpringBootApplication
public class MainTest implements ApplicationContextAware
{
    private static ApplicationContext context;
    public static void main(String[] args) {

        SpringApplication.run(MainTest.class,args);

//        Producer producer = context.getBean(Producer.class);
//        Destination destination = new ActiveMQQueue("springboot.test.queue");
//        for(int i=0;i<10;i++)
//        {
//            producer.sendMessage(destination,"I am "+i);
//        }



        //topic
        Publish publish = context.getBean(Publish.class);
        Destination destination = new ActiveMQTopic("springboot.test.topic");
        for(int i=100;i<=200;i++)
        {
            publish.publishMessage(destination,"不知道是么意思+"+i+"；烦，看不到未来。。。。。。");
        }
        log.info("-------------over---------------");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        context = applicationContext;
    }
}
