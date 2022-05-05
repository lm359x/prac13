package org.example.springhomework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = context.getBean("student",Student.class);
        System.out.println(student.toString());
        context.close();
    }
}
