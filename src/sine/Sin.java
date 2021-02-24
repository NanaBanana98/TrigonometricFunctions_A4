package sine;

import general.*;

/**
 * This class is used to calculate sin
 * @author Ariana Avdoulos
 * @version 2
 */
public class Sin {

	/**
	 * To calculate sine, a series was used. A series adds a number of quantites.
	 *  The N_UpperBound variable indicates how many times a summation will occour. 
	 */
	public static final int N_UpperBound = 11;

	/**
	 * Calculate the sine value of an angle
	 * 
	 * @param a - An angle measurement
	 * @return the sine value
	 */
	public static double calculate(IAngleMeasurement a) {

		// If an angle has a value greater than the unit circle => reduce the value to be in the bounds of the unit circle
		if (a.getRadianMeasurement() >= 2 * Maths.PI || a.getRadianMeasurement() <= -2 * Maths.PI) {
			IAngleMeasurement b = new DegreeMeasurement(a.findAngleInUnitCircle());
			return Sin_Initial(b.getRadianMeasurement(), 1);

		}

		return Sin_Initial(a.getRadianMeasurement(), 1);	//calls this to account for  n placeholder needed for recusion. Just did not match specifications for calculate(IAngle)
	}

	/**
	 * This is a recursive version of sin. It calls 
	 * @param x - angle to calculate sin of. This angle should be in radians
	 * @param n - current place in summation (should start at n=1 and increment until the N_UpperBound)
	 * @return sin(x)
	 */
	private static double Sin_Initial(double x, int n) {

		if (N_UpperBound <= n) {
			return 0;	//once upper bound is reached, return 0 and stop recursion
		}

		return formulaForN(n, x) + Sin_Initial(x, n + 1);	//sums current n-value quantity with the n+1 value quantity
	}

	/**
	 * @param n
	 * @param x
	 * @return
	 */
	private static double formulaForN(long n, double x) {
		int sign;	//Indicates if value is -1 or 1
		
		//The formula for the Taylor / Maclaurin Series for Sin (x) calls for alternating signs. when n is even, the sign is negative and vice versa.
		//This if statement checks if n is even or odd and properly assigns sign a value of 1 or -1 (1 because 1 is multiplicative identity)
		if (n % 2 == 0) {
			sign = -1;
		} else {
			sign = 1;
		}

		long alwaysOdd = (2 * n) - 1;	//the n value in the formula is always transformed into an odd value
		long factorial = Maths.factorial(alwaysOdd);	
		double power = Maths.power(x, (int)alwaysOdd);

		return sign * (power / factorial);	//this is the basic formula for the Taylor / Maclaurin Series for Sin (x)
	}
}
