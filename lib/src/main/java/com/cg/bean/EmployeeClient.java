package com.cg.bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;



//OVERALL TWO WAYS OF DEPENDENCY INJECTION 1. Using class/annotation and no xml 2. Using xml

//Constructor dependency injection is used here
//other ways are setter 
//try out method one also (not sure if exists)
public class EmployeeClient {

	public static void main(String[] args) {
		
		//USED WITH XML WAY
		/*
		 * Resource resource = new ClassPathResource("config.xml");
		 * 
		 * BeanFactory factory = new XmlBeanFactory(resource);
		 * 
		 * Employee e = (Employee) factory.getBean("employee");
		 * 
		 * Employee e2 = (Employee)factory.getBean("emp2"); System.out.println(e);
		 * System.out.println(e2);
		 */
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		Employee e = ctx.getBean(Employee.class);
		System.out.println(e);

	}

}
