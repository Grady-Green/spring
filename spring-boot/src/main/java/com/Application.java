package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Arrays;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/23.
 */
@SpringBootApplication
@EnableSwagger2
@EnableTransactionManagement
@EnableScheduling
@MapperScan("com.dao")
public class Application {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(args));
        SpringApplication.run(Application.class,args);
    }
}
