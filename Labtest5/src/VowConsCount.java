import java.util.Scanner;

public class VowConsCount {

	static void  countvc(String str)
	{
		int vCount=0;
		int cCount=0;
		for(int i = 0; i < str.length(); i++) {  
            //Checks whether a character is a vowel  
            if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {  
                //Increments the vowel counter  
                vCount++;  
            }  
            //Checks whether a character is a consonant  
            else if(str.charAt(i) >= 'a' && str.charAt(i)<='z') {    
                //Increments the consonant counter  
                cCount++;  
            }  
        }  
        System.out.println("Number of vowels: " + vCount);  
        System.out.println("Number of consonants: " + cCount);  
    }  
	public static void  main(String[] args) {
		VowConsCount cv=new VowConsCount();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your String");
		String str=sc.nextLine();
		cv.countvc(str);
		
		
	}

}
