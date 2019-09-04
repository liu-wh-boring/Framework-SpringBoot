package com.chapter05.task;

import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

@Component
public class AsynTask
{
    private  final  static SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Async
    public Future<String> task1() throws InterruptedException
    {
        System.out.println("任务1-begin"+dateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(20);
        System.out.println("任务1-end"+dateFormat.format(new Date()));
        return new AsyncResult<String>("任务1.完成");
    }

    @Async
    public Future<String> task2() throws InterruptedException
    {
        System.out.println("任务2-begin"+dateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(20);
        System.out.println("任务2-end"+dateFormat.format(new Date()));
        return new AsyncResult<String>("任务2=完成");
    }

    @Async
    public Future<String> task3() throws InterruptedException
    {
        System.out.println("任务3-begin"+dateFormat.format(new Date()));
        TimeUnit.SECONDS.sleep(20);
        System.out.println("任务3-end"+dateFormat.format(new Date()));
        return new AsyncResult<String>("任务3+完成");
    }


}
