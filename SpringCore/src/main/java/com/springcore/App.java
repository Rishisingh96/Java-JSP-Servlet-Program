package com.springcore;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String config_log = "/com/resourses/config.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config_log");
//        Student student1 = (Student)context.getBean("student1");
//        //Student student2 = (Student)context.getBean("student2");
//
//        System.out.println(student1);
//       // System.out.println(student2);
        
        Student student1 = (Student)context.getBean("stdId");
      //  System.out.println(student1);
        student1.display();
    }
}
