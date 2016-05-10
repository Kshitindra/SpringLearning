package com.wf.ect.ca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	
	public static void main(String[] args){
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj=(HelloWorld)context.getBean("helloWorld");
		obj.getMessage();
		obj.setMessage("Kshitindra");
		System.out.println("Message is changed and the new message is: "+obj.getMessage());
		obj.getMessage();
		HelloWorld obj2=(HelloWorld)context.getBean("helloWorld");
		System.out.println("Message in the second bean "+obj2.getMessage());
		obj2.getMessage();
		SetterInjection setterInjObj=(SetterInjection)context.getBean("setterInjection");
		System.out.println("setterInjObj Values: var1 and var2 are " +setterInjObj.getVar1() +", "+ setterInjObj.getVar2());
		ConstructorInjection constructoInjObj=(ConstructorInjection)context.getBean("constructorInjection");
		System.out.println("constuctorInjObj Values: var1 and var2 are " +constructoInjObj.var1 +", "+ constructoInjObj.var2);
	}
	

}
