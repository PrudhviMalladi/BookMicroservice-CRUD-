package com.Project3.Book.service;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Project3.Book.model.Book;
import com.Project3.Book.repository.BookRepo;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	 private BookRepo bookRepo;

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return bookRepo.save(book);
	}

	@Override
	public List<Book> fetchBookList() {
		// TODO Auto-generated method stub
		return (List<Book>) bookRepo.findAll() ;
	}

	@Override
	public Book updateBook(Book book, int BookId) {
		Book Books =bookRepo.findById(BookId).get();
		if(Objects.nonNull(book.getBooksname())
				&& !"" .equalsIgnoreCase(
						book.getBooksname())) {
			Books.setBooksname(book.getBooksname());
			
		}
		if(Objects.nonNull(book.getAuthor())
				&& !"" .equalsIgnoreCase(book.getAuthor())) {
			Books.setAuthor(book.getAuthor());
		}
		
		return bookRepo.save(Books);
	}

	@Override
	public void deleteBookById(int BookId) {
		// TODO Auto-generated method stub
		bookRepo.deleteById(BookId);
	}

}
