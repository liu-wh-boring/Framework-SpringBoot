package com.chapter09.banner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.core.SpringVersion;

@SpringBootApplication
public class BannerMain
{
    public static void main(String[] args) {
       // AnsiOutput.setEnabled(AnsiOutput.Enabled.ALWAYS);
        new SpringApplicationBuilder(BannerMain.class)//
                .main(SpringVersion.class) // 这个是为了可以加载 Spring 版本
               // .bannerMode(Banner.Mode.CONSOLE)// 控制台打印
                .run(args);
    }
}
