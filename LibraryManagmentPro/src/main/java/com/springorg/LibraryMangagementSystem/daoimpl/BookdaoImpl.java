package com.springorg.LibraryMangagementSystem.daoimpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.springorg.LibraryMangagementSystem.dao.Bookdao;
import com.springorg.LibraryMangagementSystem.entity.Book;

public class BookdaoImpl implements Bookdao {
	private HibernateTemplate ht;

	@Transactional
	public int insertBook(Book b) {
		int id =(Integer) ht.save(b);
		return 1;
	}

	@Transactional
	public int deleteBook(int bid) {
		ht.delete(bid);
		return 1;
	}

	public List<Book> getBooks() {

		List<Book> deptList = ht.loadAll(Book.class);
		return deptList;

	}

	@Transactional
	public Book updateBook(Book b) {
		
		ht.update(b);
		return b;
	}
	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}