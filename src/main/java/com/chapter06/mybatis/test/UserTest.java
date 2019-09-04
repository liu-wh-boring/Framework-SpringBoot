package com.chapter06.mybatis.test;

import com.chapter06.mybatis.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
@Slf4j
public class UserTest {
    @Autowired
    private UserService userService;

    @Scheduled(initialDelay = 2000,fixedDelay = 1000000)
    public void select()
    {
        log.info("开始任务。。。。。。。。。。。。。。。。。。。。。。。。。");
        log.info(userService.selectUsers().toString());
    }
}
