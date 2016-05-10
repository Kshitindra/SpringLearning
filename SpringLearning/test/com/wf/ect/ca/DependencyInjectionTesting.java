package com.wf.ect.ca;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependencyInjectionTesting {

	
	ApplicationContext context =new ClassPathXmlApplicationContext("Beans.xml");
	TextEditor textEditorBean;
	
	@Before
	public void setUp() throws Exception {
		
		textEditorBean=(TextEditor)context.getBean("textEditorBean");
	}

	@Test
	public void test() {
		fail("Not yet implemented");
	}

}
