package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        ApplicationContext ctx =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BookService service = ctx.getBean("bookService", BookService.class);
        service.addBook("Spring Deep Dive");

        ((ClassPathXmlApplicationContext) ctx).close();
    }
}
