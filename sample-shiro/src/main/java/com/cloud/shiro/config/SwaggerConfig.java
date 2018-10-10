package com.cloud.shiro.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author wangzhijun
 * @create 2018-09-25 10:16
 * @description
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(createApiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.cloud.shiro.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo createApiInfo() {
        return new ApiInfoBuilder()
                .title("Spring Boot中使用Swagger2构建RESTful APIs")
                .contact("happilysheep")
                .version("1.0")
                .build();
    }
}
