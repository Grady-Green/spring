package com.controller;

import com.entity.User;
import com.dao.UserDao;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/23.
 */
@RestController
@RequestMapping("/")
@Api("测试接口")
public class TestController {
    @Autowired
    private  UserDao userdao;
    @ApiOperation(value = "test")
    @RequestMapping(value = "add")
    public String add(){
        return "success";
    }

    @RequestMapping("get")
    public User get(){
        return userdao.get((long) 1);
    }

    @GetMapping("ret")
    public String ret(){
        return "return ---   -----";
    }
}
