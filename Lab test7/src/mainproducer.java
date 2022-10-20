
public class mainproducer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//creating instance 
		Producer pp=new Producer();
		suppythread spt=new suppythread(pp);
		demand dmd=new demand(pp);
		
		dmd.start();
		spt.start();

	}

}
