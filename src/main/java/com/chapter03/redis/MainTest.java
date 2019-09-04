package com.chapter03.redis;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.data.redis.core.RedisTemplate;

@SpringBootApplication
@Slf4j
public class MainTest implements ApplicationContextAware
{
    @Autowired
    private RedisTemplateService redisTemplateService;

    private static ApplicationContext context;

    public static void main(String[] args) {

        SpringApplication.run(MainTest.class,args);

        try
        {
            MainTest test = context.getBean(MainTest.class);
            test.redisTemplateService.set("name3","hb");
            log.info("---------------结束----------------");
          //  log.info(test.redisTemplateService.get("name").toString());
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        MainTest.context = applicationContext;
    }
}
