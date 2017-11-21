package com.aspect;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
@Service
public class DemoAnnotationService {
    @Action(name = "dd")
    public void add(){

    }
}
