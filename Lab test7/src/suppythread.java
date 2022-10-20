
public class suppythread  extends Thread{
	private Producer pv;

	public suppythread(Producer pv) {
		super();
		this.pv = pv;
	}

	
	public suppythread(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	public suppythread() {
		super();
		// TODO Auto-generated constructor stub
	}

	 public void run() {
		 pv.supply(109);
	 }
}
