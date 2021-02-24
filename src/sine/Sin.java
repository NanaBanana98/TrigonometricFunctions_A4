package sine;
import java.math.BigDecimal;
import java.math.RoundingMode;

import general.*;


/**
 * This class is used to calculate sin
 * @author Ariana Avdoulos
 * @version 1
 */
public class Sin {

	/**
	 * Calculate the sine value of an angle
	 * @param a - An angle measurement
	 * @return the sine value
	 */
	public static double calculate(IAngleMeasurement a) {
		//double result = a.quadrantShift();
		//IAngleMeasurement angle = new RadianMeasurement(result);
		
		return Sin_Initial(a.getRadianMeasurement(), 1);
	}
	
	public static final int N_UpperBound = 11;

	public static double Sin_Initial(double x,int n) {
		
		if(N_UpperBound <= n)
		{
			return 0;
		}
		
		return fun(n,x) + Sin_Initial(x, n+1);
	}
	
	private static double fun(long n, double x) {
		long sign;
		if(n%2 == 0)
		{
			sign = -1;
		}else {
			sign = 1;
		}
		
		long oddn = (2*n)-1;
		int oddn_int = (int) oddn;
		long factorial = factorialTest.factorial( oddn).longValueExact();
		double power = Maths.power(x, oddn_int);
		
		return sign * (power / factorial);
	}
}
