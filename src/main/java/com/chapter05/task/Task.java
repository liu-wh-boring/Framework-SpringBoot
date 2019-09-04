package com.chapter05.task;

import ch.qos.logback.core.util.FixedDelay;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

//@Component
public class Task
{
    private  final  static  SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @Scheduled(cron = "0 9 1 ? * *")
    public void task1()
    {
        System.out.println("111111111111111111111");
    }

    /**
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:13:05 启动点
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:13:25
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:13:45
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:14:05
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:14:25
     * >>>>>> fixRateTime >>>>>间隔2秒执行一次..：2019-07-07 01:14:45
     */
   // @Scheduled(fixedRate = 20000 ) //上一次开始执行时间点后再次执行；间隔20秒执行一次
    public void task2()
    {
        System.out.println(">>>>>> fixRateTime >>>>>间隔20秒执行一次..：" + dateFormat.format(new Date()));
    }

    // 第一次延时1秒执行，以后每2秒执行一次
   // @Scheduled(fixedDelay = 2000)
    public void task3(){
        System.out.println(">>>>>>>>>> fixedDelayTime >>>>>>>>第一次1秒后执行，当执行完后2秒再执行.：" + dateFormat.format(new Date()));
    }

    //理解FixedDelay和FixedRate
    //Delay结束时间开始算
    //rate从开始时间算
   @Scheduled(fixedRate = 5000)
    public void test() throws Exception
    {
        Thread.sleep(2000);
        System.out.println(dateFormat.format(new Date()));
    }
}
