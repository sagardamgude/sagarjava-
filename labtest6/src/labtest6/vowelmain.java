package labtest6;

public class vowelmain {

	public static void main(String[] args) {
		vowel vw=new vowel();
		try {
			vw.countVowels();
		}catch( checkedException e){
			System.out.println("we find X in the string "+e);
			
		}

	}

}
