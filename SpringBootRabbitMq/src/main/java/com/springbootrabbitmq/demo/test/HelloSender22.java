package com.springbootrabbitmq.demo.test;

import com.springbootrabbitmq.demo.test.entity.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
public class HelloSender22 {

    @Autowired
    private AmqpTemplate rabbitTemplate;

    public void send(User user) {
        String sendMsg = "测试测试 " + new Date();
        System.out.println("Sender2 : " + "测试测试");
        this.rabbitTemplate.convertAndSend("helloQueue", user);
    }

}