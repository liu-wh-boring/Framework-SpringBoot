package com.chapter02.ws;

import lombok.extern.slf4j.Slf4j;

import org.springframework.stereotype.Component;
import org.w3c.dom.NodeList;

import javax.xml.soap.SOAPException;
import java.util.List;

@Component
@Slf4j
public class AuthInterceptor //extends AbstractPhaseInterceptor<SoapMessage>
{

//    public AuthInterceptor()
//    {
//        //定义在哪个阶段进行拦截
//        super(Phase.PRE_PROTOCOL);
//    }
//
//    @Override
//    public void handleMessage(SoapMessage soapMessage) throws Fault
//    {
//        log.info("------------进入校验了");
//        List<Header> headers = null;
//        String username=null;
//        String password=null;
//        try
//        {
//            headers = soapMessage.getHeaders();
//        }
//        catch (Exception e)
//        {
//            e.printStackTrace();
//        }
//
//        if (headers == null) {
//            throw new Fault(new IllegalArgumentException("找不到Header，无法验证用户信息"));
//        }
//        SOAPException soapExc = new SOAPException("认证失败");
//        throw new Fault(soapExc);
//    }
}
