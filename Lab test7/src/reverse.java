
public class reverse extends Thread {
	private fiiboorev rv;
	//counstructor
	public reverse(fiiboorev rv) {
		super();
		this.rv = rv;
	}

	public reverse() {
		// TODO Auto-generated constructor stub
	}

	//run methoed
	public void run() {
		rv.rev();
	}


}
