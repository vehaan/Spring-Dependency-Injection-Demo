package com.cg.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//this is a replacement of xml configuration
//metadata for creation of beans

@Configuration
public class MyBookConfig {
	
	@Bean
	public Author author() {
		return new Author("Kanetkar","Nagpur");
	}
	
	@Bean(initMethod="setUp",destroyMethod="cleanUp")
	public Book book() {
		Book boo = new Book();
		boo.setYear("1995");
		boo.setIsbn("kj77756");
		boo.setAuthor(author());
		return boo;
	}
}
