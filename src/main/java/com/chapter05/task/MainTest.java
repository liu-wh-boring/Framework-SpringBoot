package com.chapter05.task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import sun.applet.Main;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class MainTest
{
    public static void main(String[] args) {
        SpringApplication.run(MainTest.class,args);
    }
}
