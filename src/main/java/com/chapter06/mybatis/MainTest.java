package com.chapter06.mybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@MapperScan("com.chapter06.mybatis.dao")
public class MainTest
{
    public static void main(String[] args) {
        SpringApplication.run(com.chapter06.mybatis.MainTest.class,args);
    }
}
