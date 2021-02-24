package sine;

import java.util.*; 
import java.math.BigInteger;

//	        return f.multiply(factorial(n-1));

public class factorialTest {

	private static Map<Long,BigInteger > SaveValues = new HashMap<>();

	
	public factorialTest() {
	}
	
	
	static public BigInteger factorial(long n)
	{
		//throw exception if n is too large
		//throw exception if n is less than 0

	    BigInteger f = BigInteger.valueOf(n);

	    if(n == 1 || n == 0)
	    {
	        return BigInteger.ONE;
	    }
	    
	    if(!SaveValues.containsKey(n)) {
	    	BigInteger i = f.multiply(factorial(n-1));
	    	SaveValues.put(n, i);
	    }

	    return SaveValues.get(n);
	}
	
}
