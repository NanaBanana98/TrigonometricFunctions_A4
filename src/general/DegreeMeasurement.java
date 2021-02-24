package general;

/**
 * @author Ariana Avdoulos, Ang Li
 *
 * Represents degree angle measurements
 */
public class DegreeMeasurement extends IAngleMeasurement {

	double degrees = 0;
	
	public DegreeMeasurement(double degrees) {
		this.setDegrees(degrees);
	}
	
	/**
	 * @return true if value was set; false otherwise
	 */
	private boolean setDegrees(double degrees)
	{
		this.degrees = degrees;
		return true;
	}
	
	/**
	 * @return The value of the angle in radians
	 */
	public double getRadianMeasurement() {
		return this.degrees / 180.0 * Maths.PI;
	}

	/**
	 * @return The value of the angle in degree
	 */
	public double getDegreeMeasurement() {
		return this.degrees;
	}

}
