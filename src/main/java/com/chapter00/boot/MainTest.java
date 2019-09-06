package com.chapter00.boot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(T01_Conditional.class)
public class MainTest
{
    @Autowired(required = false)
    private static T01_Conditional conditional;

    public static void main(String[] args)
    {
        SpringApplication application = new SpringApplication(MainTest.class);

        SpringApplication.run(MainTest.class,args);
        //ApplicationContext context = new AnnotationConfigApplicationContext(MainTest.class);
        //T01_Conditional conditional = context.getBean(T01_Conditional.class);
        System.out.println(conditional);
    }
}
