package labtest6;

public class mainmail{

	public static void main(String[] args) {
		InvalidMailIdException ml=new InvalidMailIdException();
		try {
		ml.validateEmail();
		}catch(InvalidMailIdExceptio e) {
			System.out.println("enter valide emaol"+e);
		}

	}

}
