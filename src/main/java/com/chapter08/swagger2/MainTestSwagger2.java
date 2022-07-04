package com.chapter08.swagger2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class MainTestSwagger2
{
    public static void main(String[] args)
    {
        System.out.println("待调试");
        SpringApplication.run(MainTestSwagger2.class,args);
    }
}
