package com.aspect;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
@Configuration
@ComponentScan("com.aspect")
@EnableAspectJAutoProxy //开启Spring对Aspect的支持
public class AopConfig {
}
