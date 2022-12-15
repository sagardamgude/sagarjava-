package com.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");

		StudentDao stdao = (StudentDao) ac.getBean("stbean1");


		System.out.println("Student Id :" +st.getSid());
		System.out.println("Student S_Name :" +st.getSname());
		System.out.println("Student S_Contact :" +st.getBook());
	}

}