package com.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/25.
 */
@Component
public class RedisClient {
    @Autowired
    private JedisPool jedisPool;

    public void set(String key,String value){

        Jedis jedis = null;

        try {
            jedis = jedisPool.getResource();
            jedis.set(key,value);
        }finally {
            jedis.close();
        }

    }

    public String get(String key){
        Jedis jedis = null;

        try {
            jedis = jedisPool.getResource();
            String result = jedis.get(key);
            return result;
        }finally {
            jedis.close();
        }
    }
}
