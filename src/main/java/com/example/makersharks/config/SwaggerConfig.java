package com.example.makersharks.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api() {
        return new Docket(springfox.documentation.spring.web.plugins.Docket.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.example.makersharks"))
            .paths(PathSelectors.any())
            .build();
    }
}
