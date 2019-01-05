package com.netcracker.autowiring.byname;

import com.netcracker.autowiring.Musician;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-byname-config.xml");
        Musician musician = (Musician) context.getBean("anton");
        musician.perform();
    }
}
