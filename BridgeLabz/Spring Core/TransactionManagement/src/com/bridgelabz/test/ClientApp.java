package com.bridgelabz.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import com.bridgelabz.service.BankService;

public class ClientApp {
public static void main(String[] args) {
	ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
   //get proxy object
	
	BankService proxy=context.getBean("tbfb", BankService.class);
	
	//call b.method
	
	System.out.println("Money Transfered?"+proxy.transferMoney(1002, 1001, 500));




}
}
