package com.chapter02.ws;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@javax.jws.WebService(serviceName = "HelloService", // 与接口中指定的name一致
        portName = "HelloPort",
        targetNamespace = "http://service.ws.sample/",// 与接口中的命名空间一致,一般是接口的包名倒
        endpointInterface = "com.chapter02.ws.Hello")// 接口地址
@Service
@Slf4j
public class HelloService implements Hello
{

    @Override
    public String sayHello(String myname)
    {
        log.info("cxf---------->{}",myname);
        return "fuck";
    }
}
