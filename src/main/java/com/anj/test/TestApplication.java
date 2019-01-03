package com.anj.test;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@MapperScan("com.anj.test.mapper")
public class TestApplication extends SpringBootServletInitializer {

    public static void main ( String[] args ) {
        SpringApplication.run( TestApplication.class , args );
    }

    
    protected SpringApplicationBuilder configure ( SpringApplicationBuilder application ) {
        return application.sources( TestApplication.class );
    }
}
