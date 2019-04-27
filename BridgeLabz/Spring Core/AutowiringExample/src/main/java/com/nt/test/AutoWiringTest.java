package com.nt.test;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.beans.TravelAgent;

public class AutoWiringTest {

	public static void main(String[] args) {
//		DefaultListableBeanFactory factory=null;
//		XmlBeanDefinitionReader reader=null;
//		TravelAgent agent=null;
//		//create IOC container
//		factory=new DefaultListableBeanFactory();
//		//create Reader
//		reader=new XmlBeanDefinitionReader(factory);
		
		
		ApplicationContext factory=new ClassPathXmlApplicationContext("applicationContext.xml");
		TravelAgent  agent=(TravelAgent)factory.getBean("agent");
        //invoke method
         agent.executePlan();
	}

}
