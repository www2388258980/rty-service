package com.asiainfo.vpn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
 * 告诉spring为mapper类生成bean对象
 * */

@Configuration
@MapperScan("com.asiainfo.vpn.mapper")
public class MybatisConfig {

}
