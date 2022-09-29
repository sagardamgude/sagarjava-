
public class Mainmember {

	public static void main(String[] args ) {
	Empolyee e=new Empolyee();
	System.out.println("employee information");
	e.setName("sagar");
	System.out.println("name is "+e.getName());
	e.setAge(21);
	System.out.println("Age is "+e.getAge());
	e.setSal(20000);
	System.out.println("sallary is "+e.getSal());
	e.setAddress("mumbai");
	System.out.println("Addres is "+e.getAddress());
	e.setPhone_no("9082442813");
	System.out.println("phone is "+e.getPhone_no());
	e.setSpecialization("IT");
	System.out.println("specilizaton is "+e.getSpecialization());
	
	Manager m=new Manager();
	System.out.println("\nManger iformation");
	m.setName("Arya");
	System.out.println("name is "+m.getName());
	m.setAge(20);
	System.out.println("Age is "+m.getAge());
	m.setSal(20200);
	System.out.println("sallary is "+m.getSal());
	m.setAddress("pune");
	System.out.println("Addres is "+m.getAddress());
	m.setPhone_no("9982442813");
	System.out.println("phone is "+m.getPhone_no());
	m.setDepartment("IT");
	System.out.println("specilizaton is "+m.getDepartment());
	
	
	
	
   
 
   
    
    
	
	


	}

}
