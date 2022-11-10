import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MainEmployee {

	public static void main(String[] args) {
		List <Employee>ep=new ArrayList<>();
		//add instance of 6 Employees in a collection.
		Employee e1=new Employee("sagar","it",10,15000);
		Employee e2=new Employee("vishal","abc",25,20000);
		Employee e3=new Employee("arya","pqr",18,30000);
		Employee e4=new Employee("pravin","xyz",22,35000);
		Employee e5=new Employee("priti","qvw",16,7000);
		Employee e6=new Employee("ram","wwww",20,19000);
		ep.add(e1);
		ep.add(e2);
		ep.add(e3);
		ep.add(e4);
		ep.add(e5);
		ep.add(e6);
		
		//Print the List Sorted on their name(use lambda experssion to override compare()) 

		Collections.sort(ep, (o1, o2) -> (o1.getName().compareTo(o2.getName())));
        System.out.println("Sorting Name => " + ep);
        
        
        //filter and print employees whose salary is greater than 10000 and  also print the total number of employees having salary  greater than 10000.

        
		List<Employee>nep=ep.stream().filter((p1)->p1.getSal()> 10000).collect(Collectors.toList());
		System.out.println("employee sallary greter than 10000:\n"+nep);
		System.out.println("count of employee whos sallary is greter than 10000 ="+nep.stream().count());
		
		//Print employee name whose salary is maximum.
		System.out.println("hoghest Sallary "+ep.stream().max((p1,p2)->p1.getSal()>p2.getSal()?1:-1).map(e->e.getName()));
			
	}

}
