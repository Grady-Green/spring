package com;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/5.
 */
@FeignClient("eureka-client")//要访问的服务名称
public interface DcClient {
    @GetMapping("/dc")
    String consumer();

}
