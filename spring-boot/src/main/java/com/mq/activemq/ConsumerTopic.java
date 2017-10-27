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
public class ConsumerTopic {
    @JmsListener(destination = "test_topic")
    public void receiveTopic(String message){
        System.out.println("T1 接收到的Topic信息： "+message);
    }

    @JmsListener(destination = "test_topic")
    public void receiveTopic1(String message){
        System.out.println("T2 接收到的Topic信息： "+message);
    }


    @JmsListener(destination = "test_topic")
    public void receiveTopic2(String message){
        System.out.println("T3 接收到的Topic信息： "+message);
    }
}
