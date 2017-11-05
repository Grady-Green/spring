package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/3.
 */
@RestController
public class DcController {
    @Autowired
    RestTemplate restTemplate;
    @GetMapping("/consumer")
    public String dc() {
//        DiscoveryEnabledNIWSServerList
        /**
         * url: 服务名称+mapping
         * 这里请求的host位置并没有使用一个具体的IP地址和端口的形式，而是采用了服务名的方式组成。
         * 因为Spring Cloud Ribbon有一个拦截器，
         * 它能够在这里进行实际调用的时候，自动的去选取服务实例，
         * 并将实际要请求的IP地址和端口替换这里的服务名，从而完成服务接口的调用。
         */
        String url = "http://eureka-client/dc";
        return restTemplate.getForObject(url, String.class);
    }
}
