package com.daoimpl;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.dao.studentdio;
import com.hiberutil.Hyberutil;
import com.springorg.LABTEST14.entity.Student;

public class Studentdaoimpl implements studentdio {
	Session session = Hyberutil.getSession();

	public boolean insertStudent(Student s) {
		Transaction tx = session.beginTransaction();
		session.save(s);
		tx.commit();
		session.close();
		return true;
	}

	public Student getStudent(int sid) {
		
		return session.get(Student.class,sid);
	}

	public boolean deleteStudent(int sid) {
		Transaction tx = session.beginTransaction();
		Student s=session.get(Student.class,sid);
		session.delete(s);
		tx.commit();
		session.close();
		return true;
	}

	public boolean updateStudent(int sid,String sname) {
		Transaction tx = session.beginTransaction();
		Student s = session.get(Student.class, sid);
		s.setSname(sname);;
		session.update(s);
		tx.commit();
		session.close();
		return true;
	}

}
