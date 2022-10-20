
public class Producer {
	int availableProduct=90;
	//creating methoed  
	synchronized public void demand(int n) {
		System.out.println("available product is  "+availableProduct);
		try {
		if(availableProduct<=n)
		wait();
		availableProduct-=n;
		System.out.println("available Product after supply"+availableProduct);
		
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
	}

	synchronized public void  supply(int a) {
		//supply incresing the product
		System.out.println("aavailable  Product before increase the suplyier "+availableProduct);
		availableProduct+=a;
		System.out.println("aavailable  Product after increase the suplyier "+availableProduct);
		notify();
	
	}
}
