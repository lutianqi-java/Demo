package com.springbootrabbitmq.demo.test;
import com.springbootrabbitmq.demo.test.entity.User;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "helloQueue")
public class HelloReceiver1 {

    @RabbitHandler
    public void process(User user) {
        System.out.println("Receiver1111111  : " + user.getName()+"///////"+user.getPass());
    }

}