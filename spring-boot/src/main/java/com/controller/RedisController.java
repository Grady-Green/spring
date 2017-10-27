package com.controller;

import com.config.RedisClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/25.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private RedisClient redisClient;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(String key){
        System.out.println(key);
        return  redisClient.get(key);
    }
}
