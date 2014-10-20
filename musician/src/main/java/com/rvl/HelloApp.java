package com.rvl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloApp {
    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Performer performer = (Performer)context.getBean("duke");
        try {
            performer.perform();
        } catch (Exception e) {
            e.printStackTrace();
        }

        //HelloService helloService = context.getBean(HelloService.class);
        //System.out.println(helloService.sayHello());
    }
}
