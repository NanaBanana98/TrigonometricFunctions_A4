package general;

public class RadianMeasurement implements IAngleMeasurement{

	double radians = 0;
	
	public RadianMeasurement(double radian) {
		this.SetRadian(radian);
	}
	
	private boolean SetRadian(double radian)
	{
		this.radians = radian;
		return true;
	}
	
	@Override
	public double GetRadianMeasurement() {
		return this.radians;
	}

	@Override
	public double GetDegreeMeasurement() {
		return this.radians * 180.0 / Maths.PI;
	}

}
