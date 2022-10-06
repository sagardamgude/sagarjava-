import java.util.Scanner;

public class Palindrome {

	
		 public static void isPalindrome(String str)
		    {
		        // Initializing an empty string to store the reverse
		        // of the original str
		        String rev = "";
		 
		        // Initializing a new boolean variable for the
		        for (int i = str.length() - 1; i >= 0; i--) {
		            rev = rev + str.charAt(i);
		        }
		 
		        System.out.println(rev);
		        
		        // Checking if both the strings are equal
		      
		        if (str.contentEquals(rev)) {
		        	System.out.println("palindrome ");
		        	
		        }
		        else {
		        	System.out.println("not palindrome");
		        
		        }
		       
		        }
	
		 public static void main(String[] args) {
		
			 
		  Palindrome pl=new Palindrome();
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter your String");
		  String str=sc.nextLine();
		  pl.isPalindrome(str);

	}

}
