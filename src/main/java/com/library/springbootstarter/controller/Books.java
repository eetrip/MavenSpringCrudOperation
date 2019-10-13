package com.library.springbootstarter.controller;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Books {
	
	@Id
	private String id;
	private String BookName;
	private String WriterName;
	
	public Books() {
		
	}
	
	public Books(String id, String bookName, String writerName) {
		super();
		this.id = id;
		BookName = bookName;
		WriterName = writerName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getBookName() {
		return BookName;
	}
	public void setBookName(String bookName) {
		BookName = bookName;
	}
	public String getWriterName() {
		return WriterName;
	}
	public void setWriterName(String writerName) {
		WriterName = writerName;
	}

}
