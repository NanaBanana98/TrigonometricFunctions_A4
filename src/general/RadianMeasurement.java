package general;

public class RadianMeasurement extends IAngleMeasurement{

	double radians = 0;
	
	public RadianMeasurement(double radian) {
		this.setRadian(radian);
	}
	
	private boolean setRadian(double radian)
	{
		this.radians = radian;
		return true;
	}
	
	public double getRadianMeasurement() {
		return this.radians;
	}

	public double getDegreeMeasurement() {
		return this.radians * 180.0 / Maths.PI;
	}

}
