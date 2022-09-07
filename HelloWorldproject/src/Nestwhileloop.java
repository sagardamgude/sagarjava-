
public class Nestwhileloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i = 2;
		 int j;

	       
	        while (i <= 5) {
	            System.out.println( i);
	            j = 1;
	           while(j<=10)
	           {
	        	   System.out.println(i+"*"+j+"="+(i*j));
	        	   j++;
	           }
	           i++;

	}
	}
}


