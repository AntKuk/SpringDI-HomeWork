package com.netcracker.lookup;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("lookup-config.xml");
        IShop usedCarShop = (IShop) context.getBean("usedCarShop");
        IShop luxuryCarShop = (IShop) context.getBean("luxuryCarShop");


        displayInfo(usedCarShop);
        displayInfo(luxuryCarShop);

    }

    public static void displayInfo(IShop shop) {
        shop.grazia();
        Car car1 = shop.getCar();
        Car car2 = shop.getCar();

        System.out.println("Are Car instances the same?--> " + (car1 == car2));
    }
}
