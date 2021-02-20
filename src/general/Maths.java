package general;

public class Maths {
	   public static final double E = 2.7182818284590452354;	//approx. value of e
	    
	   public static final double PI = 3.14159265358979323846;	//approx. value of pi
	   
	   /**
	    * Get a power n
	    * @param a - base
	    * @param n - power
	    * @return a^n
	    */
	   public static double power(double a, int n) {
	       double result=1;
	       for(int i=0;i<n;i++) {
	           result=result*a;
	       }
	       return result;
	   }
	   
	   /***
	    * Gets a! 
	    * @param a - value to find factorial of (ex. a = 5, factorial returns 5!)
	    * @return a!
	    */
	   public static double factorial(int a) {
	       double result=1;
	       for(double i=1;i<=a;i++) {
	           result=result*i;
	       }
	       return result;
	   }
	   
	   
	   /***
	    *
	    * @return Bernoulli numbers Bn
	    */
	   public static double[] Bernoulli() {
	       double[] result= {1/6,1/30,1/42,1/30,5/66,691/2730,7/6,3617/510,43867/798,174611/330};        
	       return result;
	   }

}

