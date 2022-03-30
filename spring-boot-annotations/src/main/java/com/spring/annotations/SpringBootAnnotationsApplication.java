package com.spring.annotations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringBootAnnotationsApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringBootAnnotationsApplication.class, args);
		
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		TextEditor te = (TextEditor)context.getBean("txtEdit");
		te.spellCheck();
	}

}
