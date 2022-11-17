package labtesjunit;

import java.security.InvalidParameterException;
import java.util.ArrayList;

public class addmul {

	//Write a program for addition() and multiplication() of two numbers.Write test cases for each of these methods.

	public int multiplication(int a, int b) {
		return a * b;
	}
	public int addition(int a, int b) {
		return a + b;
	}
	
	
	
	//Write a program for to check a palindrome string. Write test cases for 4 different parameters (use @parametrizedTest annotaion).


	
	public Boolean ispalindrome(int number) {
		int Temp, Reminder, Reverse = 0;
	
		Temp = number;
		while(Temp > 0) {
			Reminder = Temp %10;
			Reverse = Reverse * 10 + Reminder;
			Temp = Temp /10;
		}
		
		if(number == Reverse) {
			return true;
		}
	
		else
		{
			
		return false;
		}
	}
 
	  
	
}
