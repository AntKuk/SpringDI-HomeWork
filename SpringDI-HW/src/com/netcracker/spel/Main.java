package com.netcracker.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spel-config.xml");
        MyBean myBean = (MyBean) context.getBean("myBean");
        System.out.println("Name--> " + myBean.getName() + ", age--> " + myBean.getAge());
    }
}
