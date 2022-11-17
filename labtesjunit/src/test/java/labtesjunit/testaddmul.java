package labtesjunit;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
public class testaddmul {
	addmul am=new addmul();
	@Test
	public void testAddition()
	{
	    assertEquals(30,am.addition(10,20));
	    
	}
	@Test
	public void multiplication()
	{
	    assertEquals(30,am.multiplication(10,3));
	    
	}
	@ParameterizedTest
	@ValueSource(ints = {121,212})

	public void testpalindrome(int i)
	{
	    System.out.println("i= :" + i);
		assertTrue(am.ispalindrome(i));

	}
	

	

}
