package tangent;

import general.*;

public class Tan {

	public static double calculate(IAngleMeasurement a)
	{
	       double[] bernoulli=new double[10];
	       bernoulli=Maths.Bernoulli();
	       double temp;
	       double sum=0;
	       for(int i=1;i<=10;i++) {
	           temp=Maths.power(2,2*i)*(Maths.power(2,2*i)-1)*bernoulli[i]*Maths.power(a.getRadianMeasurement(),2*i-1)/Maths.factorial(i);
	           sum=sum+temp;
	       }
	       return sum;
	}
}
