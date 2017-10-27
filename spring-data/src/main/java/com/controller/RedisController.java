package com.controller;

import com.redis.Person;
import com.redis.PersonDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/26.
 */
@RestController
@RequestMapping("/redis")
public class RedisController {
    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Autowired
    private RedisTemplate<Object,Object> redisTemplate;


    @Autowired
    private PersonDao personDao;

    @RequestMapping(value = "get",method = RequestMethod.GET)
    public String get(String key){
        System.out.println("key = " + key);
        return stringRedisTemplate.opsForValue().get(key);
    }

    @RequestMapping(value = "setStr",method = RequestMethod.POST)
    public void setString(String key,String value){
        System.out.println("传入的参数信息： --  key = " + key+" value = " + value);
        personDao.saveString(key,value);
    }

    @RequestMapping(value = "getBeforeSet",method = RequestMethod.POST)
    public String getBeforeSet(String key){
        System.out.println("传入的参数信息 --- key = " + key);
        String str = personDao.getStr(key);
        return str;
    }

    @RequestMapping(value = "saveObject",method = RequestMethod.POST)
    public void saveObject(@RequestBody Person person){
        personDao.save(person);
    }
    @RequestMapping(value = "getObject",method = RequestMethod.GET)
    public Person getObject(String key){
       return personDao.getObject(key);
    }
}
