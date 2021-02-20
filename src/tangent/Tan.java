package tangent;

import general.*;

public class Tan {

	public static double calculate(IAngleMeasurement A)
	{
		try {
        	double a = A.quadrantShift();
        	if(a==Maths.PI/2) {
        		throw new Exception();  //HalfPiInputForTanException
        	}
        	double[] bernoulli=new double[10];
        	bernoulli=Maths.Bernoulli();
        	double temp;
        	double sum=0;
        	for(int i=1;i<=10;i++) {
        		temp=Maths.power(2,2*i)*(Maths.power(2,2*i)-1)*bernoulli[i]*Maths.power(a,2*i-1)/Maths.factorial(i);
        		sum=sum+temp;
        	}
        	Quadrant q = A.getQuadrant();
        	if(q== Quadrant.Q2 || q== Quadrant.Q4) {
        		sum=0-sum;
        	}
        	return sum;
    	}
    	catch(Exception e){
    		System.out.printf("Input cannot be PI/2 or 3*PI/2 \n");
    		return -1;
    	}
	}
}
