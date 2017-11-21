package com;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/11/5.
 */
@RestController
public class DcController {
    @Autowired
    private ConsumerService consumerService;
    @GetMapping("consumer")
    public String dc()throws Exception{
        return consumerService.consumer();
    }

    @Service
    class ConsumerService{
        @Autowired
        private RestTemplate restTemplate;

        /**
         * 服务降级
         * @return
         * @throws Exception
         */
        @HystrixCommand(fallbackMethod = "fallback")
        public String consumer()throws Exception{
            //服务消费方触发了服务请求超时异常，服务消费者就通过HystrixCommand注解中指定的降级逻辑进行执行，因此该请求的结果返回了fallback
            //Thread.sleep(5000); 加到服务端
            return restTemplate.getForObject("http://eureka-client/dc",String.class);
        }

        private String fallback(){
            return  "Fail";
        }
    }
}
