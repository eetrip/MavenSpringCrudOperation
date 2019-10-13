package com.library.springbootstarter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	
	@Autowired
	private BookService bookService;

		@RequestMapping("/books")
		public List<Books> getAllBooks() {
			return bookService.getAllBooks();
		}
		
		@RequestMapping("/books/{id}")
		public Books getBook(@PathVariable String id) {
			return bookService.getBooks(id);
		}
		
		@RequestMapping(method=RequestMethod.POST, value="/books")
		public void addBook(@RequestBody Books book) {
			bookService.addBook(book);
		}
		
		@RequestMapping(method=RequestMethod.PUT, value="/books/{id}")
		public void updateBook(@RequestBody Books book, @PathVariable String id) {
			bookService.updateBook(id, book);
		}
		
		@RequestMapping(method=RequestMethod.DELETE, value="/books/{id}")
		public void deleteBook(@PathVariable String id) {
			bookService.deleteBooks(id);
		}
		
}
	