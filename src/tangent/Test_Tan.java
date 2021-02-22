import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import general.*;

class Tan_Test {

	/***
	 * 
	 * BoundryTest
	 * 
	 */
	
	// Rad Test
	
	@Test
	public void radCartesianBoundryTestWithZero() {
		IAngleMeasurement radian = new RadianMeasurement(0);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void radCartesianBoundryTestWithP() {
		IAngleMeasurement radian = new RadianMeasurement(Maths.PI);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void radCartesianBoundryTestWithDoubleP() {
		IAngleMeasurement radian = new RadianMeasurement(Maths.PI*2);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void radNegativeBoundryTestWithP() {
		IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void radNegativeBoundryTestWithDoubleP() {
		IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*2);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	// Deg Test
	
	@Test
	public void degCartesianBoundryTestWith180() {
		IAngleMeasurement radian = new DegreeMeasurement(180);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void degCartesianBoundryTestWith360() {
		IAngleMeasurement radian = new DegreeMeasurement(360);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void degNegativeBoundryTestWith180() {
		IAngleMeasurement radian = new DegreeMeasurement(-180);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void degNegativeBoundryTestWith360() {
		IAngleMeasurement radian = new DegreeMeasurement(-360);
		Assert.assertEquals(0.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	/***
	 * 
	 * Greater and Less 
	 * 
	 */
	
	//Rad Test
	
	@Test
	public void degTestPositiveAngleGreaterthan360() {
		IAngleMeasurement radian = new DegreeMeasurement(405);
		Assert.assertEquals(1.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void degTestNegtiveAngleLessthan360() {
		IAngleMeasurement radian = new DegreeMeasurement(-405);
		Assert.assertEquals(-1.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	// Deg Test
	
	@Test
	public void radTestPositiveAngleGreaterthan2PI() {
		IAngleMeasurement radian = new RadianMeasurement(Maths.PI*9/4);
		Assert.assertEquals(1.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	@Test
	public void radTestNegtiveAngleLessthan2PI() {
		IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*9/4);
		Assert.assertEquals(-1.0,Tan_FinalVersion.calculate(radian),0.00001);
	}
	
	
	/***
	 * 
	 * AsymptoteTest
	 * 
	 */
	
	// Deg Test
	
	@Test
	public void degAsymptoteTest90() {
		IAngleMeasurement radian = new DegreeMeasurement(90);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void degAsymptoteTest270() {
		IAngleMeasurement radian = new DegreeMeasurement(270);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void degNegativeAsymptoteTest90() {
		IAngleMeasurement radian = new DegreeMeasurement(-90);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void degNegativeAsymptoteTest270() {
		IAngleMeasurement radian = new DegreeMeasurement(-270);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	// Rad Test
	
	@Test
	public void radAsymptoteTestHalfPI() {
		IAngleMeasurement radian = new RadianMeasurement(Maths.PI/2);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void radAsymptoteTesttwoThirdsPI() {
		IAngleMeasurement radian = new RadianMeasurement(Maths.PI*3/2);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void radNegativeAsymptoteTesttwoHalfPI() {
		IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI/2);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
	
	@Test
	public void radNegativeAsymptoteTesttwoThirdsPI() {
		IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*3/2);
		Assertions.assertThrows(ArithmeticException.class, () -> Tan_FinalVersion.calculate(radian));
	}
}
