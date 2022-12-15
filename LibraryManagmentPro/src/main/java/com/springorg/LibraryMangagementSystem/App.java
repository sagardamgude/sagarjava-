package com.springorg.LibraryMangagementSystem;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springorg.LibraryMangagementSystem.dao.Bookdao;
import com.springorg.LibraryMangagementSystem.entity.Book;

public class App {
	public static void main(String[] args) {

		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		Bookdao b = (Bookdao) ac.getBean("book");
		System.out.println("Press 1. To insert the studet :");
		System.out.println("Press 2. To view the student :");
		System.out.println("Press 3. To Delete Student  :");
		System.out.println("Press 4. To Update STudent  :");
		System.out.println("Press 9. To Exit :");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();

		switch (ch) {
		case 1:
			Book bk1 = new Book(1,"The Fire",100);
			Book bk2 = new Book(2,"The secrete",500);
			Book bk3 = new Book(3,"Java",400);
			Book bk4 = new Book(4,"php",300);
			b.insertBook(bk1);
			b.insertBook(bk2);
			b.insertBook(bk3);
			b.insertBook(bk4);
			System.out.println(b);
			break;
		case 2:

			List<Book> bk = b.getBooks();
			System.out.println("all books");
			break;

		case 3:
			b.deleteBook(1);
			System.out.println("delet book");
			break;

		case 4:
			Book book = new Book();
			book.setBid(1);
			book.setBTitle("python");
			book.setPrice(500);
			b.updateBook(book);
			System.out.println("update book");
			break;

		case 9:
			System.exit(ch);
			break;

		default:
			System.out.println("enter the valide number ");
		}
	}
}