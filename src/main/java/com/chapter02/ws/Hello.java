package com.chapter02.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

@WebService(targetNamespace = "http://service.ws.sample/", // 命名空间,一般是接口的包名倒序
        name = "Hello")// 暴露服务名称
public interface Hello {

    @WebResult(name = "return", targetNamespace = "")
    @RequestWrapper(localName = "sayHello",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.SayHello")
    @WebMethod(action = "urn:SayHello")
    @ResponseWrapper(localName = "sayHelloResponse",
            targetNamespace = "http://service.ws.sample/",
            className = "sample.ws.service.SayHelloResponse")
    String sayHello(@WebParam(name = "myname", targetNamespace = "") String myname);
}
