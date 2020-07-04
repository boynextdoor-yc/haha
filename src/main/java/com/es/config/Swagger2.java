package com.es.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.ParameterBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.schema.ModelRef;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Parameter;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@EnableSwagger2
@Configuration
public class Swagger2 {
    @Bean
    public Docket createRestApi() {
        //设置全局参数
        ParameterBuilder token = new ParameterBuilder();
        token.name("token").description("token，登录成功返回的token，涉及用户操作必填")
                .modelRef(new ModelRef("string"))
                .parameterType("header")
                .build();
        ParameterBuilder appid = new ParameterBuilder();
        appid.name("appid").description("appid，调用方的appid，涉及用户操作必填")
                .modelRef(new ModelRef("long"))
                .parameterType("header")
                .build();
        List<Parameter> params = new ArrayList<>();
        params.add(token.build());
        params.add(appid.build());

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build()
                .globalOperationParameters(params)
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("塔台服务中心 RESTful API")
                .description("塔台服务中心 API接口文档")
                .version("1.0")
                .build();
    }

}
