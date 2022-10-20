
public class fiiboorev {
  synchronized public void fiboo()
    {
		
        int t1 = 0, t2 = 1;
      //Declare and Initialize the number of terms
        System.out.println("First 10 terms of fibonnaci series: ");
        //Print the fibonacci series
        for (int i = 1; i <= 10; ++i)
        {
            System.out.print(t1 + " ");
            int sum = t1 + t2;
            t1 = t2;
            t2 = sum;
	}

}
	synchronized public void rev() {
		//reverse the number 
		System.out.println("\nrevers of ten number  ");
		for ( int num = 10; num >= 0; num--) { 
	    System.out.println(num);
	} 
		
	}

}
