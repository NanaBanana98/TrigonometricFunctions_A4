package sine;
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
		return a.getRadianMeasurement();
	}
}
