package com.wf.ect.ca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args){
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("Kshitindra");
		System.out.println("Message is changed and the new message is:");
		obj.getMessage();
		HelloWorld obj2=(HelloWorld)context.getBean("helloWorld");
		System.out.println("Message in the second bean");
		obj2.getMessage();
	}
	

}
