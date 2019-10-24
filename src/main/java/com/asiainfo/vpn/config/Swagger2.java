package com.asiainfo.vpn.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.asiainfo.vpn.web"))
                .paths(PathSelectors.any())
                .build();
    }
    /**
     * apiInfo()用来创建该Api的基本信息
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("vpn模块后台接口")
                .description("上海亚信，http://www.asiainfo.com")
                .termsOfServiceUrl("http://www.asiainfo.com")
                .version("1.0")
                .build();
    }

}
