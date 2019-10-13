package com.library.springbootstarter.controller;

import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Books, String> {

	Books findOne(String id);

	
	
}
