package sine;
import general.*;

public class Sin {

	public static double calculate(IAngleMeasurement a) {
	       double sum=0,temp=1;
	       for(int i = 3; i<=21; i=i+2) {
	           for(int j=i;j>0;j--) {
	               temp=temp*a.getRadianMeasurement()/j;
	           }
	           sum=sum+temp;
	       }
	       return sum;
	}
}
