
public class Employee  implements Comparable<Employee>{
	String name,dep;
	int age;
	double sal;
	public Employee(String name, String dep, int age, double sal) {
		super();
		this.name = name;
		this.dep = dep;
		this.age = age;
		this.sal = sal;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDep() {
		return dep;
	}
	public void setDep(String dep) {
		this.dep = dep;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", dep=" + dep + ", age=" + age + ", sal=" + sal + "]";
	}
	@Override
	public int compareTo(Employee o) {
		o.compareTo(o);
		return 0;
	}

}
