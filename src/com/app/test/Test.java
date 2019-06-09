package com.app.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.bean.Employee;

public class Test {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext ac= new ClassPathXmlApplicationContext("config.xml");
		Object obj= ac.getBean("empOb");
		Employee e= (Employee)obj;
		System.out.println(e);
		

	}

}
