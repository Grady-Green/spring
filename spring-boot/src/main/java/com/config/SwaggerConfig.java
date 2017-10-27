package com.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.context.request.async.DeferredResult;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ListVendorExtension;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/25.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
//    @Bean
//    public Docket demoApi(){
//        return new Docket(DocumentationType.SWAGGER_2).groupName("demo").genericModelSubstitutes(DeferredResult.class)
//                .useDefaultResponseMessages(false).forCodeGeneration(false).pathMapping("/")
//                .select().paths(PathSelectors.regex("/*")).build().apiInfo(demoApiInfo());
//    }
//
//    private ApiInfo demoApiInfo(){
//        ApiInfo apiInfo = new ApiInfo("自己平台的api","swagger搭建的api文档","1.0","http://www.baidu.com","ddd");
//        return apiInfo;
//    }





    @Bean
    public Docket demoApi() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("demo")
                .genericModelSubstitutes(DeferredResult.class)
                .useDefaultResponseMessages(false)
                .forCodeGeneration(false)
                .pathMapping("/") //根路径
                .select().paths(PathSelectors.any())//筛选展示的接口，使用PathSelectors.any()，展示所有接口
                .build().apiInfo(myApiTittle());
    }
    //api信息
     private ApiInfo demoApiInfo() {
        ApiInfo apiInfo = new ApiInfo("自己平台的api",//大标题
                 "swagger搭建api平台",//小标题
                 "1.0",//版本
                 "NO terms of service",
                "632104866@qq.com",//作者
                 "这是我的技术博客站点",//链接显示文字
                 "http://www.kailing.pub"//网站链接
                 );
        return apiInfo;
    }

    private ApiInfo myApiTittle(){

        List<VendorExtension> list = new ArrayList<>();
        VendorExtension v1 = new VendorExtension() {
            @Override
            public String getName() {
                return "hahah";
            }

            @Override
            public Object getValue() {
                return "hehehe";
            }
        };
        list.add(v1);

        ApiInfo apiInfo = new ApiInfo("Spring Boot Api",
               "Swagger搭建的api平台",
                "1.0",
                "http://www.baidu.com",
                new Contact("宫宇","http://gongyu.com","gongyu649424146@163.com"),
                "Spring Boot License","http://spting.io",list);
        return apiInfo;
    }
}
