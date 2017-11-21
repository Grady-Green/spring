package com.config;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Grady
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/7.
 */
@Component
@PropertySource("classpath:config.properties")//不能加载yml文件！
@ConfigurationProperties("application.user")
public class ReadConfiguration {
    private String name;
    private Integer age;
    private String city;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
