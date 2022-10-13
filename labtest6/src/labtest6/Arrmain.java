package labtest6;

import java.rmi.AccessException;

public class Arrmain {

	public static void main(String[] args) {
		Arrayexp ar=new Arrayexp();
	try {
			try {
				ar.sum(args);
			} catch (AccessException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}catch (IllegalArgumentException e){
			System.out.println("enter nly numer"+e);
			
		}
		catch (NullPointerException nl) {
			System.out.println(nl);
		}
		catch(ArrayIndexOutOfBoundsException a) {
			System.out.println(a);
		}
		catch (exception v) {
			System.out.println(v);
		}

	}

}
