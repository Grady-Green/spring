package com.config;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;

/**
 * @Description:
 * @Todo: Created by Grady on 2017/10/25.
 */
@Configuration
public class RedisConfig {
    @Bean(name = "jedis.pool")
    public JedisPool jedisPool(@Qualifier("jedis.pool.config")GenericObjectPoolConfig jedisConfig,
                               @Value("${jedis.pool.host}")String host,
                               @Value("${jedis.pool.port}")int port){
        return new JedisPool(jedisConfig,host,port);
    }

    @Bean(name = "jedis.pool.config")
    public GenericObjectPoolConfig jedisConfig(@Value("${jedis.pool.maxTotal}")int maxTotal,
                                               @Value("${jedis.pool.maxIdle}")int maxIdle){
        GenericObjectPoolConfig genericObjectPoolConfig = new GenericObjectPoolConfig();
        genericObjectPoolConfig.setMaxTotal(maxTotal);
        genericObjectPoolConfig.setMaxIdle(maxIdle);
        return genericObjectPoolConfig;
    }
}
