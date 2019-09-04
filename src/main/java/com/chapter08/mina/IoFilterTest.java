package com.chapter08.mina;

import lombok.extern.slf4j.Slf4j;
import org.apache.mina.core.filterchain.IoFilter;
import org.apache.mina.core.filterchain.IoFilterChain;
import org.apache.mina.core.session.IdleStatus;
import org.apache.mina.core.session.IoSession;
import org.apache.mina.core.write.WriteRequest;

@Slf4j
public class IoFilterTest implements IoFilter
{

    @Override
    public void init() throws Exception {
        //log.info("init");
    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void onPreAdd(IoFilterChain ioFilterChain, String s, NextFilter nextFilter) throws Exception {

    }

    @Override
    public void onPostAdd(IoFilterChain ioFilterChain, String s, NextFilter nextFilter) throws Exception {

    }

    @Override
    public void onPreRemove(IoFilterChain ioFilterChain, String s, NextFilter nextFilter) throws Exception {

    }

    @Override
    public void onPostRemove(IoFilterChain ioFilterChain, String s, NextFilter nextFilter) throws Exception {

    }

    @Override
    public void sessionCreated(NextFilter nextFilter, IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionOpened(NextFilter nextFilter, IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionClosed(NextFilter nextFilter, IoSession ioSession) throws Exception {

    }

    @Override
    public void sessionIdle(NextFilter nextFilter, IoSession ioSession, IdleStatus idleStatus) throws Exception {

    }

    @Override
    public void exceptionCaught(NextFilter nextFilter, IoSession ioSession, Throwable throwable) throws Exception {

    }

    @Override
    public void messageReceived(NextFilter nextFilter, IoSession ioSession, Object o) throws Exception {

    }

    @Override
    public void messageSent(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) throws Exception {

    }

    @Override
    public void filterClose(NextFilter nextFilter, IoSession ioSession) throws Exception {

    }

    @Override
    public void filterWrite(NextFilter nextFilter, IoSession ioSession, WriteRequest writeRequest) throws Exception {

    }
}
