
public class Member {
	String name ;
	int age ;
	int sal;
	String Address;
	String phone_no;
	
	
	public Member(String name, int age, int sal, String address, String phone_no) {
		super();
		this.name = name;
		this.age = age;
		this.sal = sal;
		Address = address;
		this.phone_no = phone_no;
	}



	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}



	public int getSal() {
		return sal;
	}



	public void setSal(int sal) {
		this.sal = sal;
	}



	public String getAddress() {
		return Address;
	}



	public void setAddress(String address) {
		Address = address;
	}



	public String getPhone_no() {
		return phone_no;
	}



	public void setPhone_no(String phone_no) {
		this.phone_no = phone_no;
	}



	

//	void printsallary()
//	{
//		
//	}


}