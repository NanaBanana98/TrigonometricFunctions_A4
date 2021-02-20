package cosine;

import general.*;

public class Cos {

	public double calculate(IAngleMeasurement a) {
	       double sum=0,temp=1;
	       for(int i = 2; i<=20; i=i+2) {
	           for(int j=i;j>0;j--) {
	               temp=temp*a.GetRadianMeasurement()/j;
	           }
	           sum=sum+temp;
	       }
	       return sum;
	}
}
