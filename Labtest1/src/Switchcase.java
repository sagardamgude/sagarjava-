
public class Switchcase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
		int b=2;
		String cha="+";
		switch(cha)
		{
		case "+":System.out.println(a+b);
		break;
		case "-":System.out.println(a-b);
		break;
		case "*":System.out.println(a*b);
		break;
		case "/":System.out.println(a/b);
		break;
		default: System.out.println("wrong input" );
		}
	}

}
