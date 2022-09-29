
public class Empolyee extends Member {
	String specialization;

	public Empolyee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Empolyee(String specialization) {
		super();
		this.specialization = specialization;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
		
	}

	void printinfo()
	{
		System.out.println("name "+name );
		System.out.println("age "+age );
		System.out.println("sallary" +sal );
		System.out.println("adress  "+Address );
		System.out.println("phone "+phone_no);
		System.out.println("specialization"+specialization);
	}


	
	
	
}
