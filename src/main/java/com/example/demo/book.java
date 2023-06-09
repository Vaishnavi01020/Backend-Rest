package com.example.demo;
//package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="book")

public class book {
	public book(int book_id, String book_name, String author, String ing) {
		super();
		this.book_id = book_id;
		Book_name = book_name;
		Author = author;
		this.ing = ing;
	}
	public int getBook_id() {
		return book_id;
	}
	public void setBook_id(int book_id) {
		this.book_id = book_id;
	}
	public String getBook_name() {
		return Book_name;
	}
	public void setBook_name(String book_name) {
		Book_name = book_name;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getPrice() {
		return ing;
	}
	public void setPrice(String ing) {
		this.ing = ing;
	}
	
	@Id
	private int book_id;
	private String Book_name;
	private String Author;
	private String ing;
	
	public book()
	{
		
	}
	
}
