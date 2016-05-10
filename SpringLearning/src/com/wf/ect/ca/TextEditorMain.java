package com.wf.ect.ca;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TextEditorMain {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
		/*System.out.println("Just before getting TextEditor bean from Spring Container");
		TextEditor obj=(TextEditor)context.getBean("textEditorBean");
		obj.checkSpelling();*/
	}

}
