import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

public class StudentList  
{
	//creating object
	 static ArrayList <Student>list1=new  ArrayList<>();
	 static ArrayList <Student>list2=new  ArrayList<>();

//main methoed
	public static void main(String[] args) {
		 fillArrayList();
		printArrayList();
		
	}
//inserting element
	public static void fillArrayList()
	{
	    list1=new ArrayList<>();
	   
	    Student a1=new Student(12,"sagar","9876544323");
	    Student a2=new Student(10,"vishal","8766544323");
	    Student a3=new Student(19,"pratik","8765944323");
	    list1.add(a1);
	    list1.add(a2);
	    list1.add(a3);
	    list2=new ArrayList<>();
	    Student s1=new Student(10,"anju","9876544323");
	    Student s2=new Student(8,"ans","8766544323");
	    Student s3=new Student(1,"phs","8765944323");
	    list2.add(s1);
	    list2.add(s2);
	    list2.add(s3);

	}
	//printing element
private static void printArrayList() {

//	Collections.sort(list1, new stdid());
//	Collections.sort(list2, new stdid());
	Collections.sort(list1,(o1,o2)-> {
		return (o1.getName().compareTo(o2.getName()));
	}

);
	Collections.sort(list2, new stdname());
		   
		   
		    Iterator itr=list1.iterator();
		    System.out.println("list1 elements ");
		   while(itr.hasNext())
		   {
			   System.out.println(itr.next());
		   }
		  
		    Iterator itr2=list2.iterator();
		    System.out.println("list2 elements");
		   while(itr2.hasNext())
		   {
			   System.out.println(itr2.next());
		   }
	}
}
