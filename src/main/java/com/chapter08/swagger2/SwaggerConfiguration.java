package com.chapter08.swagger2;

import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;


@Configuration
@ConditionalOnExpression("${swagget.enbale}")
public class SwaggerConfiguration
{
    @Bean
    public Docket createRestApi()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.chapter08.swagger2"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo()
    {
        return new ApiInfoBuilder()
                .title("RESTFUL API DOC")
                .description("Spring-Boot--RESTFUL风格的接口文档在线自动生成")
                .termsOfServiceUrl("http://blog.csdn.net/appleyk")
                .version("1.0")
                .licenseUrl("http://localhost:8888/")
                .build();
    }
}
