import java.util.HashSet;

public class StudentHash {
	 public static void main(String[] args) {
		 //creating object
	 HashSet<Student> std=new HashSet<>();
	 //inserting data 
		Student s1=new Student(1, "arya", "9307515220");
		Student s2=new Student(2,"Sagar","8530895620");
		Student s3=new Student(3,"kaan","8830501654");
		Student s4=new Student(4,"rahul","9011202277");
		Student s5=new Student(5,"akash","9856235478");
		Student s6=new Student(6,"annu","8778562360");
		//adding data
		std.add(s1);
		std.add(s2);
		std.add(s4);
		std.add(s5);
		std.add(s3);
		std.add(s6);
		//printing 
		for (Student student : std) {
			if (student.getSid()>3) {
				System.out.println(student);
			}
		}  

}
}	 
