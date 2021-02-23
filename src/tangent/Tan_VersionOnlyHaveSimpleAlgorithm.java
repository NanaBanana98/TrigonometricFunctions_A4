package tangent;

import general.*;

public class Tan_VersionOnlyHaveSimpleAlgorithm {

	public static double calculate(IAngleMeasurement A)
	{
    	double a = A.quadrantShift();
    	double[] bernoulli=new double[11];
    	bernoulli=Maths.Bernoulli();
    	double temp;
    	double sum=0;
    	for(int i=1;i<=10;i++) {
    		temp=Maths.power(2,2*i)*(Maths.power(2,2*i)-1)*bernoulli[i]*Maths.power(a,2*i-1)/Maths.factorial(2*i);
    		sum=sum+temp;
    	}
    	return sum;    	
	}
}