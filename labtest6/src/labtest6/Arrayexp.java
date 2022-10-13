package labtest6;

import java.rmi.AccessException;

public class Arrayexp {
	public static void sum(String[] args)throws AccessException, exception{
		
	int sum=0;
	int start=2;
	int end =6;

	try {
		for (int i=0;i<5;i++)
		{
			
				sum=sum+Integer.parseInt(args[i]);
		

	    }}catch (IllegalArgumentException y) {
	    	System.out.println(y);
	    }
		
		if (args.length==0)
			throw new NullPointerException("null array ");
		if  (args.length>=5)
			throw new ArrayIndexOutOfBoundsException("enter valide array");
		if(sum==0)
			throw new exception("sum cannot be zero"); 
	  System.out.println("sum of arrray is "+sum);		
	}

}
