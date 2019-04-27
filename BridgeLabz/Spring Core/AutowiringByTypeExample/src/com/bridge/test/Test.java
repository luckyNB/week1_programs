package com.bridge.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	
	ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");

Object object=context.getBean("employee");

System.out.println(object.toString());


}
}
