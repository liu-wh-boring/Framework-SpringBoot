package com.chapter01.log;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j //使用lombok简化日志logger：
public class LoggerTest
{
    LoggerTest()
    {
        log.trace("TRACE < DEBUG < INFO < WARN < ERROR < FATAL");
        log.debug("DEBUG < INFO < WARN < ERROR < FATAL");
        log.info("INFO < WARN < ERROR < FATAL");
        log.warn("WARN < ERROR < FATAL");
        log.error("ERROR < FATAL");
        log.info("我是谁{},{}","hb","xg");//可以用{}占位符来拼接字符串，免去了用"+"拼接字符串。输出结果
    }
}
