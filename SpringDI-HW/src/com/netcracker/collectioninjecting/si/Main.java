package com.netcracker.collectioninjecting.si;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("collectioninjecting-config.xml", "injectingtypes-config.xml");
        BookList list = (BookList) context.getBean("bookListSI");
        BookSet set = (BookSet) context.getBean("bookSetSI");
        MyMap map = (MyMap) context.getBean("myMapSI");

        System.out.println(list.getList());
        System.out.println("List size --> " + list.getList().size());
        System.out.println();
        System.out.println(set.getSet());
        System.out.println("Set size --> " + set.getSet().size());
        System.out.println();
        System.out.println(map.getCarMap());

    }
}
