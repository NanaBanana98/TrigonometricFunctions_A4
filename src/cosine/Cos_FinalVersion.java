package cosine;

import general.*;

public class Cos_FinalVersion {

	public static double calculate(IAngleMeasurement a) {
	       double sum=1.0,temp=1.0;
	       for(int i = 2; i<=28; i=i+2) {
	           for(int j=i;j>0;j--) {
	               temp=temp*a.getRadianMeasurement()/j;
	           }
	           sum=sum+Maths.power(-1.0,i/2)*temp;
	           temp=1.0;
	       }
	       return sum;
	}
}

