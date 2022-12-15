package com.spring.StudentDaoImpl;

import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.spring.StudentDao.StudentDao;
import com.spring.entities.Student;


public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate ht;

	// To insert record of student
	@Transactional
	public int insertStudent(Student st) {
		int sid = (int) ht.save(st);
		return 1;

	}

	// To update record of student
	@Transactional
	public int updateStudent(Student st) {
		ht.update(st);
		return 1;

	}

	// To delete record of student
	@Transactional
	public int deleteStudent(Student st) {
		ht.delete(st);
		return 1;

	}

	// To get specific record
	public Student getStudent(int id) {

		Student st = ht.get(Student.class, id);
		return st;

	}

	// To get all records
	public List<Student> getAllStudents() {

		List<Student> stList = ht.loadAll(Student.class);
		return stList;

	}

	public HibernateTemplate getHt() {
		return ht;
	}

	public void setHt(HibernateTemplate ht) {
		this.ht = ht;
	}

}