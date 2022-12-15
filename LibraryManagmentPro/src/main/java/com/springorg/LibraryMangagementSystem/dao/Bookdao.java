package com.springorg.LibraryMangagementSystem.dao;

import java.util.List;

import com.springorg.LibraryMangagementSystem.entity.Book;


public interface Bookdao {
	
	public int insertBook(Book b);
	public int deleteBook(int bid);
	public List<Book> getBooks();
	public Book updateBook(Book b);
	

}