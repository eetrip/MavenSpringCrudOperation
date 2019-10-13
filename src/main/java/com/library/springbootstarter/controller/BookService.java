package com.library.springbootstarter.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {
	
		@Autowired
		private BookRepository bookRepository;

		public List<Books> getAllBooks(){
			
			List<Books> books = new ArrayList<>();
			bookRepository.findAll()
			.forEach(books::add);
			return books;
		}
		
		public Books getBooks(String id) {
			return bookRepository.findOne(id);
			
		}

		public void addBook(Books book) {
			bookRepository.save(book);
			
		}

		public void updateBook(String id, Books book) {
			bookRepository.save(book);
			}
			

		public void deleteBooks(String id) {
			bookRepository.deleteById(id);
		}
}
