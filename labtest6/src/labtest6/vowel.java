package labtest6;

import java.util.Scanner;

public class vowel {
       
		public static void countVowels() throws checkedException {
		String s1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String ");
		s1=sc.nextLine();
		s1.toLowerCase();
		int count=0;
		String str[]=s1.split("  ");	
		for (int i = 0; i < str.length; i++) {
            // check if char[i] is vowel
            if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e'
                || s1.charAt(i) == 'i'
                || s1.charAt(i) == 'o'
                || s1.charAt(i) == 'u')
            {
                // count increments if there is vowel in
                // char[i]
                count++;
            }
            if(s1.contains("x"))
    			throw new checkedException("x is found");
		}
		 System.out.println("count of vowel is "+count);

	    }
}

