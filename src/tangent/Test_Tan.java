package tangent;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import general.*;

class Tan_Test {

	/***
	 * 
	 * BoundryTest
	 * 
	 */
	
	@Nested
	@DisplayName("Boundary Test")
	class BoundryTest{
		
		@Nested
		@DisplayName("Radian Test")
		class RadianBoundryTest{
			
			@Nested
			@DisplayName("Postive Test")
			class PostiveRadianBoundryTest{
				
				@Test
				public void TestWithZero() {
					IAngleMeasurement radian = new RadianMeasurement(0);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void TestWithPI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void TestWithDoublePI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI*2);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithZero() {
					IAngleMeasurement radian = new RadianMeasurement(0.1);
					Assert.assertEquals(0.100335,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithHalfPI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI/2+0.1);
					Assert.assertEquals(-7.371660,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithPI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI+0.1);
					Assert.assertEquals(0.100335,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithTwoThirdPI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI*3/2+0.1);
					Assert.assertEquals(-7.371660,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithDoublePI() {
					IAngleMeasurement radian = new RadianMeasurement(Maths.PI*2+0.1);
					Assert.assertEquals(0.100335,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}				
				
			}
			
			@Nested
			@DisplayName("Negative Test")
			class NegativeRadianBoundryTest{
				
				@Test
				public void radNegativeBoundryTestWithP() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void radNegativeBoundryTestWithDoubleP() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*2);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
								
				@Test
				public void JustAboveTestWithHalfPI() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI/2+0.1);
					Assert.assertEquals(-7.371660,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithPI() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI+0.1);
					Assert.assertEquals(0.100335,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithTwoThirdPI() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*3/2+0.1);
					Assert.assertEquals(-7.371660,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWithDoublePI() {
					IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*2+0.1);
					Assert.assertEquals(0.100335,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
											
			}
					
		}
		
		@Nested
		@DisplayName("Degree Test")
		class DegreeBoundryTest{
			
			@Nested
			@DisplayName("Postive Test")
			class PostiveRadianBoundryTest{
				
				@Test
				public void TestWith180() {
					IAngleMeasurement radian = new DegreeMeasurement(180);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void TestWith360() {
					IAngleMeasurement radian = new DegreeMeasurement(360);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith90() {
					IAngleMeasurement radian = new DegreeMeasurement(90.1);
					Assert.assertEquals(-12.909791,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith180() {
					IAngleMeasurement radian = new DegreeMeasurement(180.1);
					Assert.assertEquals(0.001745,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith270() {
					IAngleMeasurement radian = new DegreeMeasurement(270.1);
					Assert.assertEquals(-12.909791,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith360() {
					IAngleMeasurement radian = new DegreeMeasurement(360.1);
					Assert.assertEquals(0.001745,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				
				
			}
			
			@Nested
			@DisplayName("Negative Test")
			class NegativeRadianBoundryTest{
				
				@Test
				public void TestWith180() {
					IAngleMeasurement radian = new DegreeMeasurement(-180);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void TestWith360() {
					IAngleMeasurement radian = new DegreeMeasurement(-360);
					Assert.assertEquals(0.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith90() {
					IAngleMeasurement radian = new DegreeMeasurement(-89.9);
					Assert.assertEquals(-12.909791,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith180() {
					IAngleMeasurement radian = new DegreeMeasurement(-179.9);
					Assert.assertEquals(0.001745,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith270() {
					IAngleMeasurement radian = new DegreeMeasurement(-269.9);
					Assert.assertEquals(-12.909791,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
				@Test
				public void JustAboveTestWith360() {
					IAngleMeasurement radian = new DegreeMeasurement(-359.9);
					Assert.assertEquals(0.001745,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
				}
				
			}
			
		}
		
	}
	
	/***
	 * 
	 * Greater than 360 test. 
	 * 
	 */

	@Nested
	@DisplayName("Out of 360 Test")
	class OutOf360Test{
		
		@Nested
		@DisplayName("Radian Test")
		class RadianOutOf360Test{
			
			@Test
			public void TestGreaterthan2PI() {
				IAngleMeasurement radian = new RadianMeasurement(Maths.PI*9/4);
				Assert.assertEquals(1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
			}
			
			@Test
			public void TestLessthanNegative2PI() {
				IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*9/4);
				Assert.assertEquals(-1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
			}
			
		}
		
		@Nested
		@DisplayName("Degree Test")
		class DegreeOutOf360Test{
			
			@Test
			public void TestGreaterthan360() {
				IAngleMeasurement radian = new DegreeMeasurement(405);
				Assert.assertEquals(1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
			}
			
			@Test
			public void TestLessthanNegative360() {
				IAngleMeasurement radian = new DegreeMeasurement(-405);
				Assert.assertEquals(-1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
			}
			
		}
	}
	
	/***
	 * 
	 * Whole Equivalence Partition Test
	 * 
	 */
	
	@Nested
	@DisplayName("Whole Equivalence Partition Test")
	class WholeEquivalencePartitionTest{
		
		@Test
		public void TestWith45() {
			IAngleMeasurement radian = new DegreeMeasurement(45);
			Assert.assertEquals(1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
		}
		
		@Test
		public void TestWith135() {
			IAngleMeasurement radian = new DegreeMeasurement(135);
			Assert.assertEquals(-1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
		}
		
		@Test
		public void TestWith225() {
			IAngleMeasurement radian = new DegreeMeasurement(225);
			Assert.assertEquals(1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
		}
		
		@Test
		public void TestWith315() {
			IAngleMeasurement radian = new DegreeMeasurement(315);
			Assert.assertEquals(-1.0,Tan_VersionWithQuadrantCheck.calculate(radian),0.000001);
		}
		
	}
		
	/***
	 * 
	 * Asymptote Test
	 * 
	 */
	
	@Nested
	@DisplayName("Asymptote Test")
	class AsymptoteTest{
		
		@Nested
		@DisplayName("Radian Test")
		class RadianAsymptoteTest{
			
			@Test
			public void TestWithHalfPI() {
				IAngleMeasurement radian = new RadianMeasurement(Maths.PI/2);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWithTwoThirdsPI() {
				IAngleMeasurement radian = new RadianMeasurement(Maths.PI*3/2);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWithNegativeHalfPI() {
				IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI/2);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWithNegativeTwoThirdsPI() {
				IAngleMeasurement radian = new RadianMeasurement((-1)*Maths.PI*3/2);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
		}
		
		@Nested
		@DisplayName("Degree Test")
		class DegreeAsymptoteTest{
			
			@Test
			public void TestWith90() {
				IAngleMeasurement radian = new DegreeMeasurement(90);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWith270() {
				IAngleMeasurement radian = new DegreeMeasurement(270);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWithNegative90() {
				IAngleMeasurement radian = new DegreeMeasurement(-90);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
			@Test
			public void TestWithNegative270() {
				IAngleMeasurement radian = new DegreeMeasurement(-270);
				Assertions.assertThrows(ArithmeticException.class, () -> Tan_VersionWithQuadrantCheck.calculate(radian));
			}
			
		}
		
	}
	
}
