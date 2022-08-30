package com.Project3.Book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project3.Book.model.Book;
import com.Project3.Book.repository.BookRepo;


public interface BookService {
	
	Book saveBook(Book book);
	List<Book> fetchBookList();
	
	Book updateBook (Book book, int BookId);
	void deleteBookById(int BookId);
}
	