package com.wf.ect.ca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringTesting {

	ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
	HelloWorld helloWorld;
	
	@Before
	public void setUp() throws Exception {
		
		helloWorld=(HelloWorld)context.getBean("helloWorld");
	}

	@Test
	public void test() {
		assertNotNull(helloWorld);
	}
	
	@Test
	public void testGetMessage(){
		String msg=helloWorld.getMessage();
		assertTrue(msg.equals("Hello World!"));
	}
	@Test
	public void testSingleton(){
		helloWorld.setMessage("Kshitindra");
		HelloWorld helloWorld2=(HelloWorld)context.getBean("helloWorld");
        assertTrue(helloWorld2.getMessage().equals(helloWorld.getMessage()));		
	}

}
