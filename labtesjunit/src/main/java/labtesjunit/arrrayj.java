package labtesjunit;

import java.security.InvalidParameterException;
import java.util.ArrayList;
//.Create an ArrayList.Add few elements.Write following test cases in a separate java file--a.)Test for empty list.b.)Test  for size of arrayList.

public class arrrayj {
	
	public int isArrayList()
	{
        ArrayList<Integer> arrli= new ArrayList<Integer>();
        arrli.add(8);
        arrli.add(5);
        arrli.add(6);
        arrli.add(4);
        arrli.add(9);
        return  arrli.size();
           
 
	}
}
