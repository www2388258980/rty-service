package com.asiainfo.vpn.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/*
* 告诉spring
* */

@Configuration
@MapperScan("com.asiainfo.vpn.mapper")
public class MybatisConfig {

}
