package general;

/**
 * @author Ariana Avdoulos, Ang Li
 * Represents radian angle measurements
 */
public class RadianMeasurement extends IAngleMeasurement{

	double radians = 0;	//default to zero
	
	public RadianMeasurement(double radian) {
		this.setRadian(radian);
	}
	
	/**
	 * @return true if value was set; false otherwise
	 */
	private boolean setRadian(double radian)
	{
		this.radians = radian;
		return true;
	}
	
	/**
	 * @return The value of the angle in radians
	 */
	public double getRadianMeasurement() {
		return this.radians;
	}

	/**
	 * @return The value of the angle in degree
	 */
	public double getDegreeMeasurement() {
		return this.radians * 180.0 / Maths.PI;
	}

}
