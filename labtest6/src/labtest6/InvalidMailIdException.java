package labtest6;

import java.util.Scanner;

public class InvalidMailIdException  {
	public static void validateEmail() throws InvalidMailIdExceptio {
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email address ");
		s1=sc.nextLine();
		if((s1.endsWith("@")||s1.endsWith("."))||s1.contains(" "))
			throw new InvalidMailIdExceptio("enter valide email");
		if((s1.contains("@")&&s1.contains(".")&& s1.indexOf("@")<s1.indexOf(".")))
	    System.out.println("Valide email");
		else {
			System.out.println("enter invalide email");
			throw new InvalidMailIdExceptio("") ;
		}
	    }
}
