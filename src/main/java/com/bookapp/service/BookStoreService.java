package com.bookapp.service;

import com.bookapp.dao.Book;
import com.bookapp.dao.BookDao;
import com.bookapp.dao.BookDaoImpl;

public class BookStoreService {
	private BookDao bookDao;
	
	
	
	public BookStoreService() {
		this.bookDao = new BookDaoImpl();
	}

	public void persistObjectGraph(Book book) {
	
		
		bookDao.addBook(book);
	}
	
	public Book retrieveObjectGraph(String isbn) {
		return bookDao.getBook(isbn);
	}

}




