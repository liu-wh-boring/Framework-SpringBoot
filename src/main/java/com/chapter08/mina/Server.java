package com.chapter08.mina;

import org.apache.mina.core.filterchain.DefaultIoFilterChain;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.filterchain.IoFilterChainBuilder;
import org.apache.mina.core.service.IoService;
import org.apache.mina.transport.socket.nio.NioSocketAcceptor;

public class Server
{
    public void init()
    {
        IoService service = new NioSocketAcceptor();
      
        IoFilterChainBuilder chain = service.getFilterChain();
    }
}
