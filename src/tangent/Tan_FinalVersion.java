package tangent;

import general.*;

public class Tan_FinalVersion {

	public static double calculate(IAngleMeasurement A)
	{
    	double a = A.quadrantShift();
    	if(a==Maths.PI/2) {
    		throw new ArithmeticException();  //HalfPiInputForTanException
    	}
    	double[] bernoulli=new double[11];
    	bernoulli=Maths.Bernoulli();
    	double temp;
    	double sum=0;
    	for(int i=1;i<=10;i++) {
    		temp=Maths.power(2,2*i)*(Maths.power(2,2*i)-1)*bernoulli[i]*Maths.power(a,2*i-1)/Maths.factorial(2*i);
    		sum=sum+temp;
    	}
    	Quadrant q = A.getQuadrant();
    	if(q== Quadrant.Q2 || q== Quadrant.Q4) {
    		sum=0-sum;
    	}
    	return sum;    	
	}
}
