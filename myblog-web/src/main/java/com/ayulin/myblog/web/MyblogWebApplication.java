package com.ayulin.myblog.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.ayulin.myblog.*"}) // 多模块项目中必须手动指定扫描所有类
public class MyblogWebApplication {
    public static void main(String[] args) {
        SpringApplication.run(MyblogWebApplication.class, args);
    }
}
