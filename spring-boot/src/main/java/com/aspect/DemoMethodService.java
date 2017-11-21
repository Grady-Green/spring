package com.aspect;

import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/15.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("mothod: add");
    }

    public void go(){
        System.out.println("mothod:  Go!");
    }
}
