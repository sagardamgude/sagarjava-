

public class fibbonassi extends Thread{
	private fiiboorev fs;

	 public fibbonassi(fiiboorev fs) {
		super();
		this.fs = fs;
	}

	 public fibbonassi() {
		// TODO Auto-generated constructor stub
	}
	 //run methoed 

	public void run() {
		  fs.fiboo();
	 }
	

}
