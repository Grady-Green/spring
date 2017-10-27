package com.mq.activemq;

import org.apache.activemq.command.ActiveMQQueue;
import org.apache.activemq.command.ActiveMQTopic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsMessagingTemplate;
import org.springframework.stereotype.Service;

import javax.jms.JMSException;
import javax.jms.Queue;
import javax.jms.Topic;
import javax.print.attribute.standard.Destination;

/**
 * @Description:
 * @Todo:
 * @Author Grady
 * Created on 2017/10/26.
 */
@Service
public class Producer {

    @Autowired
    private JmsMessagingTemplate jmsTemplate;



    public void sendMessage(String destination,final String message){
        Queue queue = new ActiveMQQueue(destination);
        jmsTemplate.convertAndSend(queue,message);
    }

    public void sendTopic(String message){
        Topic topic = new ActiveMQTopic("test_topic");
        jmsTemplate.convertAndSend(topic,message);
    }
}
