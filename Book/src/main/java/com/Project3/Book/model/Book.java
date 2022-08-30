package com.Project3.Book.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Book {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int booksid;
	private String booksname;
	private String author;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int booksid, String booksname, String author) {
		super();
		this.booksid = booksid;
		this.booksname = booksname;
		this.author = author;
	}
	@Override
	public String toString() {
		return "Book [booksid=" + booksid + ", booksname=" + booksname + ", author=" + author + "]";
	}
	public int getBooksid() {
		return booksid;
	}
	public void setBooksid(int booksid) {
		this.booksid = booksid;
	}
	public String getBooksname() {
		return booksname;
	}
	public void setBooksname(String booksname) {
		this.booksname = booksname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	

}
