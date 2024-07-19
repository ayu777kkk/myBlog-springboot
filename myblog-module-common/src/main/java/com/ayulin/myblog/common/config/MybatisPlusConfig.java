package com.ayulin.myblog.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: ayulin
 * @description: Mybatis Plus 配置文件
 **/
@Configuration
@MapperScan("com.ayulin.myblog.common.domain.mapper")
public class MybatisPlusConfig {
}
