package com.Project3.Book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Project3.Book.model.Book;
import com.Project3.Book.service.BookService;
@RestController
public class BookController {
	@Autowired
	 private BookService bookService;
	
	@GetMapping("/books")
	private List<Book> fetchBookList()
	{
		return bookService.fetchBookList();
	}
	@PostMapping("/books")
	public Book saveBook(@RequestBody Book book) {
		return bookService.saveBook(book);
		}




	@PutMapping("/books/{id}")
	public Book updateBook (@RequestBody Book book, @PathVariable ("id") int BookId) {
		return bookService.updateBook(book, BookId);
	}

	@DeleteMapping("/books/{id}")
	public String deleteBookById(@PathVariable("id") int BookId)
	{
		bookService.deleteBookById(BookId);
		return "Deleted Successfully";
	}
}
