package com.springorg.LABTEST14;

import java.util.Scanner;

import com.dao.studentdio;
import com.daoimpl.Studentdaoimpl;
import com.springorg.LABTEST14.entity.Student;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       studentdio s1=new Studentdaoimpl();
       System.out.println("Press 1. To insetr the studet :");
		System.out.println("Press 2. To view the student :");
		System.out.println("Press 3. To Delete Student  :");
		System.out.println("Press 4. To Update STudent  :");
		System.out.println("Press 9. To Exit :");
		Scanner scan = new Scanner(System.in);
		int ch = scan.nextInt();
		int id;
		Student s;
		switch (ch)
		{
		case 1:
		    s = new Student();
			System.out.println("enter the id ");
			id=scan.nextInt();
			s.setSid(id);
			scan.nextLine();
			System.out.println("enter the name ");
			 String name=scan.nextLine();
			s.setSname(name);
			System.out.println("enter the mobile number");
			 String mobile=scan.nextLine();
			s.setContact(mobile);
			s1.insertStudent(s);
			break;
		case 2:
			System.out.println("enter the id of student which is u want to see ");
			id=scan.nextInt();
			s = s1.getStudent(id);
			System.out.println(s);
			break;
			
		case 3:
			System.out.println("enter the id of student which is u want to see ");
			id=scan.nextInt();
			s1.deleteStudent(id);
			break;
			
		case 4:
			System.out.println("Enter Id witch u want to update");
			id = scan.nextInt();
			scan.nextLine();
			System.out.println("Enter new name which u want to set :");
			String title = scan.nextLine();
			s1.updateStudent(id, title);
	         break;
	    case 9:
				System.out.println("exit database");
				System.exit(0);

        default:
				System.out.println("Enter valid choice...");

		}
    }
}
