package com.springorg.LibraryMangagementSystem;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorg.LibraryMangagementSystem.dao.Bookdao;
import com.springorg.LibraryMangagementSystem.entity.Book;

public class BookTest {
	static Bookdao bdao;

	@BeforeAll
	public static void init() {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		bdao = (Bookdao) ac.getBean("bdao");
	}

	@Test
	public void testGetBook() {
		// negative case
		Book b = bdao.getBook(2);
		assertEquals(1, b.getBid());
	}
	
	@Test
	public void testInsertBook() {
		// positive case
		Book b  = bdao.getBook(1);
		b.setBTitle("java");
		assertEquals(1, bdao.insertBook(b));

	@Test
	public void testUpdateBook() {
		// positive case
		Book b  = bdao.getBook1(1);
		b.setBTitle("The Fire");
		assertEquals(1, bdao.updateBook(b));
		
		@Test
		public void testDeleteBook() {
			// positive case
			Book b  = bdao.getBooks(4);
			b.setBTitle("php");
			assertEquals(1, bdao.deleteBook(1));
	}

}