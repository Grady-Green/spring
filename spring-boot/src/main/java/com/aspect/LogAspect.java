package com.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
@Aspect   //声明一个切面
@Component
public class LogAspect {

    @Pointcut("@annotation(com.aspect.Action)")   //声明一个切点
    public void annotationPointCut(){
        System.out.println("===================声明一个切点");
    }

    @After("annotationPointCut()")   //用@After声明一个建言，并使用@PointCut定义的切点
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getAnnotation(Action.class);
        System.out.println("注解式拦截： "+action.name());
    }

    @Before("execution(* com.aspect.DemoMethodService.*(..))") //用@Before声明一个建言 直接重用拦截规则作为参数
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法式拦截： "+method.getName());
    }
}
