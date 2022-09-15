package labtest2;

public class Addition {

	int sum;
	void add(int a)
	{
		 int sum = 0;

	        for(int i= 1; i<= a; i++)
	        {    
	            sum =sum+i;
	            
	        }
	        System.out.println(sum);  	
		 
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Addition a=new Addition();
     a.add(100);
	}

}
