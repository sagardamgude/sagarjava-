package polymo;

public class Calculator {

	public int addition(int...n1)
	{
		int sum=0;
		for (int i=0;i<n1.length;i++)
		{
		
			sum+=n1[i];
		}
		return sum;
	}
		public double addition(double...n1)
		{
			double sum=0;
			for (int i=0;i<n1.length;i++)
			{
			
				sum+=n1[i];
			}
			return sum;
}
	
	public double division(int div,double ...n1)
	{
		//double div=null;
		for (int i=0;i<n1.length;i++)
		{
		
			div/=n1[i];
		}
		return div;
	}
	public int division(int div,int ...n1)
	{
		//double div=null;
		for (int i=0;i<n1.length;i++)
		{
		
			div/=n1[i];
		}
		return div;
	}
		public double multiplication(int mul,double...n1)
		{
			
			for (int i=0;i<n1.length;i++)
			{
			
				mul*=n1[i];
			}
			return mul;
		}
		
		public int multiplication(int mul,int...n1)
		{
			
			for (int i=0;i<n1.length;i++)
			{
			
				mul*=n1[i];
			}
			return mul;
		}
		public int subtraction(int sub,int...n1)
		{
			
			for (int i=0;i<n1.length;i++)
			{
			
				sub-=n1[i];
			}
			return sub;
		}public double subtraction(int sub,double...n1)
		{
			
			for (int i=0;i<n1.length;i++)
			{
			
				sub-=n1[i];
			}
			return sub;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Calculator cal=new Calculator();
			System.out.println("addition int "+cal.addition(26,98,6));
			System.out.println("division  int "+cal.division(90,9));
			System.out.println("multiplicatin int   "+cal.multiplication(26,2));
			System.out.println("subtraction int "+cal.subtraction(30,10));
			
			System.out.println("addition double "+cal.addition(263,983,63));
			System.out.println("division  double "+cal.division(903,93));
			System.out.println("multiplicatin double   "+cal.multiplication(2698,2));
			System.out.println("subtraction double "+cal.subtraction(3045,10));




		}
}

