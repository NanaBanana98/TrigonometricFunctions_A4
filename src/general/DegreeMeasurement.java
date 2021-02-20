package general;

public class DegreeMeasurement extends IAngleMeasurement {

	double degrees = 0;
	
	public DegreeMeasurement(double degrees) {
		this.setDegrees(degrees);
	}
	
	private boolean setDegrees(double degrees)
	{
		this.degrees = degrees;
		return true;
	}
	
	public double getRadianMeasurement() {
		return this.degrees / 180.0 * Maths.PI;
	}

	public double getDegreeMeasurement() {
		return this.degrees;
	}

}
