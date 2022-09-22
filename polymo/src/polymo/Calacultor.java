package polymo;

public class Calacultor {
	
	//variable arges........ varargs
	public int addition(int...n1)
	{
		int sum=0;
		for (int i=0;i<n1.length;i++)
		{
		
			sum+=n1[i];
		}
		return sum;
		
	}
	
	
	
	
	/*public int addition(int a,int b)
	{
		System.out.println("addition of two int");
		return a+b;
	}

	public int addition(int a,int b,int c)
	{
		System.out.println("addition of three int");
		return a+b+c;
	}
	public double addition(double a,int b)
	{
		System.out.println("addition of one double andone int");
		return a+b;
	}
	public String addition(String  a,String b)
	{
		System.out.println("addition of two String");
		return a+b;
	}*/
}
