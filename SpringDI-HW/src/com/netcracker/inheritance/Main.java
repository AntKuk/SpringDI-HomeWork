package com.netcracker.inheritance;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("inheritance-config.xml");

        Book1 book1 = (Book1) context.getBean("parentBook");
        Book2 book2 = (Book2) context.getBean("childBook");

        System.out.println("Parent-->");
        System.out.println(book1.getAuthor());
        System.out.println(book1.getTitle());
        System.out.println(book1.getPages());
        System.out.println(book1.getYear());

        System.out.println("Child-->");
        System.out.println(book2.getAuthor());
        System.out.println(book2.getTitle());
        System.out.println(book2.getPages());
        System.out.println(book2.getYear());
        System.out.println(book2.getLanguage());
    }
}
