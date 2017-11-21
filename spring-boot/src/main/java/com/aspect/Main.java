package com.aspect;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext appcontext = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = appcontext.getBean(DemoAnnotationService.class);
        DemoMethodService demoMethodService = appcontext.getBean(DemoMethodService.class);
        demoAnnotationService.add();

        demoMethodService.add();

        appcontext.close();
    }

}
