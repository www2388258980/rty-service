package com.asiainfo.rty.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
 * 告诉spring为mapper类生成bean对象
 * */

@Configuration
@MapperScan("com.asiainfo.rty.mapper")
public class MybatisConfig {

}
