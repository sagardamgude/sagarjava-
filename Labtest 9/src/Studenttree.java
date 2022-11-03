import java.util.TreeSet;

public class Studenttree {

	public static void main(String[] args) {
       TreeSet<Student> p=new TreeSet<>();
		
		StudentList.fillArrayList();
		p.addAll(StudentList.list1);
		p.addAll(StudentList.list2);
		System.out.println("Number of element in"+p.size());
		
		System.out.println("First element "+p.pollFirst());
		System.out.println("\nLast element"+p.pollLast());
	}

}	
