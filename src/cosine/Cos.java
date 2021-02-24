package cosine;

import general.*;

public class Cos {

	public static double calculate(IAngleMeasurement a) {
		// If an angle has a value greater than the unit circle => reduce the value to be in the bounds of the unit circle
		if (a.getRadianMeasurement() >= 2 * Maths.PI || a.getRadianMeasurement() <= -2 * Maths.PI) {
			a = new DegreeMeasurement(a.findAngleInUnitCircle());
			
		}
		
        double sum=1,temp=1;
        for(int i = 2; i<=28; i=i+2) {
            for(int j=i;j>0;j--) {
                temp=temp*a.getRadianMeasurement()/j;
            }
            sum=sum+Maths.power(-1.0,i/2)*temp;
            temp=1;
        }
        return sum;
	}
}
