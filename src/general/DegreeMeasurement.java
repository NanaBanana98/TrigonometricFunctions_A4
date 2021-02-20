package general;

public class DegreeMeasurement implements IAngleMeasurement {

	double degrees = 0;
	
	public DegreeMeasurement(double degrees) {
		this.SetDegrees(degrees);
	}
	
	private boolean SetDegrees(double degrees)
	{
		this.degrees = degrees;
		return true;
	}
	
	@Override
	public double GetRadianMeasurement() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double GetDegreeMeasurement() {
		return this.degrees;
	}

}
