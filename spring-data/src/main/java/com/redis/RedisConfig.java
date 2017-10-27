package com.redis;

import org.springframework.context.annotation.Bean;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/26.
 */
//@Component
public class RedisConfig {
//    @Bean
//    public RedisConnectionFactory redisConnectionFactory(){
//        return new JedisConnectionFactory();
//    }
//
//    @Bean
//    public RedisTemplate<Object,Object> redisTemplate(){
//        RedisTemplate<Object,Object> template = new RedisTemplate<>();
//        template.setConnectionFactory(redisConnectionFactory());
//        return template;
//    }
//
//    @Bean
//    public StringRedisTemplate stringRedisTemplate(){
//        StringRedisTemplate template = new StringRedisTemplate();
//        template.setConnectionFactory(redisConnectionFactory());
//        return template;
//    }
}
