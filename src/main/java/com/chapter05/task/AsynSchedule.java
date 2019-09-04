package com.chapter05.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

@Component
public class AsynSchedule
{
    @Autowired
    private AsynTask asynTask;

    @Scheduled(initialDelay = 10000,fixedDelay = 1000000000)
    public void task() throws Exception
    {
        System.out.println("执行开始了。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。。");
        Future<String> future1 = asynTask.task1();
        Future<String> future2 = asynTask.task2();
        Future<String> future3 = asynTask.task3();
        while(!(future1.isDone() && future2.isDone() && future3.isDone()))
        {
            System.out.println(future1.get());
            System.out.println(future2.get());
            System.out.println(future3.get());
            TimeUnit.SECONDS.sleep(1000);
        }
    }
}
