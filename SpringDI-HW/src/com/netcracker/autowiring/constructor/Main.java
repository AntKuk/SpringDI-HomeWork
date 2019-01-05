package com.netcracker.autowiring.constructor;

import com.netcracker.autowiring.Musician;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("autowiring-constructor-config.xml");
        MusicianConstructor musician = (MusicianConstructor) context.getBean("anton");
        musician.perform();
    }
}
