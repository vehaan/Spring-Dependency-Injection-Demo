package com.cg.bean;

public class Author {
	
	private String authorName;
	private String address;
	
	public Author(String authorName, String address) {
		super();
		this.authorName = authorName;
		this.address = address;
	}
	public Author() {
		super();
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Auhor [authorName=" + authorName + ", address=" + address + "]";
	}
	
	

}
