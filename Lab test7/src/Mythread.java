
public class Mythread extends Thread {
	
	public Mythread(String name) {
		super(name);
	
	}

	public Mythread() {
		super();
		
	}
	 public void run() {
		 String s[]= {"sagar","vishal","raj","akash","sanchit","ankush","rahul","akash","manish","arun"};
		//prining array
		 for (int i=1;i<10;i++) {
			 System.out.println(s[i]);
		 }
	 }

}
