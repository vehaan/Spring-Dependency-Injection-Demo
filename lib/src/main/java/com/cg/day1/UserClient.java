package com.cg.day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserClient {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		User user = (User)ctx.getBean("user");
		System.out.println(user.getUsername());
		

	}

}
