package com.chapter02.ws;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.xml.ws.Endpoint;

@SpringBootApplication
public class MainTest
{
//    @Autowired
//    private Bus bus;
//
//    @Autowired
//    private Hello hello;
//
//    @Autowired
//    private Interceptor interceptor;
//
//    //配置cxf服务发布,默认服务在Host:port/services/***路径下
//    @Bean
//    public Endpoint endpoint()
//    {
//        Endpoint endpoint = new EndpointImpl(bus,hello);
//        //这里相当于把HelloService接口发布在了路径/services/hello下,wsdl文档路径为http://localhost:8080/services/hello?wsdl
//        ((EndpointImpl)endpoint).getInInterceptors().add(interceptor);
//        endpoint.publish("/hello");
//        return endpoint;
//    }
//
//    public static void main(String[] args)
//    {
//        SpringApplication.run(MainTest.class,args);
//    }
}
