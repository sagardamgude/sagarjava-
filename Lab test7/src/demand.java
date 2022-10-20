
public class demand extends Thread {
	private Producer ps ;
	 public demand() {
		super();
		// TODO Auto-generated constructor stub
	}

	public demand(Producer ps) {
		super();
		this.ps = ps;
	}

	public void run() {
		ps.demand(100);
	}
}
