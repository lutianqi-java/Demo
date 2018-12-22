package com.springbootrabbitmq.demo.test.controller;

import com.springbootrabbitmq.demo.test.HelloSender12;
import com.springbootrabbitmq.demo.test.HelloSender22;
import com.springbootrabbitmq.demo.test.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/rabbit")
public class RabbitTest {
    @Autowired
    private HelloSender12 helloSender1;
    @Autowired
    private HelloSender22 helloSender2;

    @GetMapping("/hello")
    public void hello() {
        System.out.println("111");
        User user = new User();
        user.setName("1");
        user.setPass("1p");
        helloSender1.send(user);
        user.setName("2");
        user.setPass("2p");
        helloSender2.send(user);
    }
}
