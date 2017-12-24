package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/23.
 */
@SpringBootApplication
@EnableSwagger2
@EnableTransactionManagement
//@MapperScan("com.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
