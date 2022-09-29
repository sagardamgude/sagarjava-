
public class Mainbank {

	public  static void main(String[] args) {
		Bank a=(Bank) new BankA();
		Bank b=(Bank) new BankB();
		Bank c=new BankC();
		a.getbalance();
		b.getbalance();
		c.getbalance();

	}

}
