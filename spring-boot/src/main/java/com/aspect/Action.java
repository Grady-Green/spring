package com.aspect;

import java.lang.annotation.*;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
