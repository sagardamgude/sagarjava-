package com.dao;

import com.springorg.LABTEST14.entity.Student;

public interface studentdio {
	boolean insertStudent(Student s);
	Student getStudent(int sid);
	boolean deleteStudent(int sid);
	boolean updateStudent(int sid,String sname);

}
