package com.spring.StudentDao;

import java.util.List;

import com.spring.entities.Student;

public interface StudentDao {

	public int insertStudent(Student st);

	public int updateStudent(Student st);

	public int deleteStudent(Student sid);

	public Student getStudent(int sid);

	public List<Student> getAllStudents();
}