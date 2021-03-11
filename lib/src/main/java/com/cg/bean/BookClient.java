package com.cg.bean;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BookClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(MyBookConfig.class);
		
		Book book1 = (Book) ctx.getBean("book");
		System.out.println("Book hashcode :" + book1.hashCode());
		System.out.println("Book Info :" + book1);
		try {
			book1.cleanUp();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ctx.close();
		

	}

}
