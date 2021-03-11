package com.cg.bean;

import javax.annotation.*;


public class Book {
	private Author author;
	private String isbn;
	private String year;
	
	/*
	 * //depicts initialization of the book bean
	 * 
	 * @PostConstruct public void customBookInit() {
	 * System.out.println("Method customBookInit() invoked..."); }
	 * 
	 * //depicts destry
	 * 
	 * @PostConstruct public void customBookDestroy() {
	 * System.out.println("Method customBookDestroy() invoked..."); }
	 */
	
	public void setUp() throws Exception {
		System.out.println("Initializing the book bean with custom config");
	}
	
	public void cleanUp() throws Exception {
		System.out.println("Destroying the book bean with custom config");
	}
	
	public Book(Author author, String isbn, String year) {
		super();
		this.author = author;
		this.isbn = isbn;
		this.year = year;
	}
	
	public Book() {
		super();
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", year=" + year + "]";
	}
	
	

}
