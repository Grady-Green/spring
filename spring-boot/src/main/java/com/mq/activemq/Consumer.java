package com.mq.activemq;

import org.springframework.jms.annotation.JmsListener;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/26.
 */
//@Component
public class Consumer {
    @JmsListener(destination = "test_quene")
    private void receiveQueue(String test){
        System.out.println("接到的报文 = " + test);
    }
}
