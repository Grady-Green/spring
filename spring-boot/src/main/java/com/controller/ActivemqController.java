package com.controller;

import com.mq.activemq.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/26.
 */
@RestController
@RequestMapping("/mq")
public class ActivemqController {

    @Autowired
    private Producer producer;

    @RequestMapping(value = "sendMessage", method = RequestMethod.POST)
    public void send(String message) {
        producer.sendMessage("test_quene", message);
    }

    @RequestMapping(value = "sendTopic", method = RequestMethod.POST)
    public void sendTopic(String message) {
        producer.sendTopic( message);
    }
}