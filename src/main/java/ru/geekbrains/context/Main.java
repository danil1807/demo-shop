package ru.geekbrains.context;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.geekbrains.context.controller.ProductController;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();


        context.close();
    }
}
