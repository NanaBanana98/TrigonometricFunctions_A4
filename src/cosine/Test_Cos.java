package cosine;


import org.junit.jupiter.api.*;


import general.DegreeMeasurement;
import general.IAngleMeasurement;
import general.RadianMeasurement;
import sine.Sin;

class Test_Cos {

	//Testing calculate method in Sin
		@Nested
		@DisplayName("Test calculate")
		class Test_calculate{
			/*
			 * 
			 * BoundryTest
			 * 
			 */
			@Nested
			@DisplayName("Boundary Test")
			class WhenBoundryTest{
				
				@Test
				void should_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry0Degrees() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(0);	//input value
					
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					mathCosResult =Cos.calculate(angle);
					
					//assert
					Assertions.assertEquals(mathCosResult, 0, .0000001);
				}
				
				@Nested
				@DisplayName("Radian Test")
				class RadianBoundryTest{
					
					@Nested
					@DisplayName("Postive Test")
					class PostiveRadianBoundryTest{

						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryPIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(Math.PI/2);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryPIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(Math.PI);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry3PIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement((3*Math.PI)/2);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, -1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry2PIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(2*Math.PI);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
					}
					
					@Nested
					@DisplayName("Negative Test")
					class NegativeRadianBoundryTest{

						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNegPIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(-Math.PI/2);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, -1);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNegPIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(-Math.PI);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0,.3);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg3PIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(-(3*Math.PI)/2);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 1);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg2PIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(-2*Math.PI);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
						
					}

						
					}
				
				@Nested
				@DisplayName("Degree Test")
				class DegreeBoundryTest{
					
					@Nested
					@DisplayName("Postive Test")
					class PostiveDegreeBoundryTest{
						
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry90Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(90);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry180Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(180);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry270Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(270);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, -1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry360Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(360);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
					}
					
					@Nested
					@DisplayName("Negative Test")
					class NegativeDegreeBoundryTest{
						

						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg90Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(-90);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, -1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg180Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(-180);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg270Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(-270);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 1, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg360Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(-360);	//input value
							
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							mathCosResult = Cos.calculate(angle);
							
							//assert
							Assertions.assertEquals(mathCosResult, 0, .0000001);
						}
					}
					

						
					}
				}
			
			/*
			 * Values just below and above cartesian boundries (0,90,180,360)
			 */
			@Nested
			@DisplayName("Upper / Lower Boundry Test")
			class WhenUpperLowerBoundryTest{
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry0Degrees() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(0 - .1);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .0000001);
				}
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry0Degrees() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(0 +.1);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .0000001);
				}
				
				@Nested
				@DisplayName("Radian Test")
				class RadianUpperLowerBoundryTest{
					@Nested
					@DisplayName("Just Below")
					class PostiveJustBelowRadianBoundry{
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundryPIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( (Math.PI/2) - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundryPIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(Math.PI - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry3PIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( ((3*Math.PI)/2) - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .00001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry2PIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( (2*Math.PI) - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .001);
						}
						
					}
					
					@Nested
					@DisplayName("Just Above")
					class PostiveJustAboveRadianBoundry{
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundryPIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( (Math.PI/2) + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundryPIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement(Math.PI + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Sin.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry3PIover2Radians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( ((3*Math.PI)/2) + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .00001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry2PIradians() {
							//assign
							IAngleMeasurement angle = new RadianMeasurement( (2*Math.PI) + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .01);
				}
				
				}
				}
				@Nested
				@DisplayName("Radian Test")
				class DegreeUpperLoweBoundryTest{
					@Nested
					@DisplayName("Just Below")
					class PostiveJustBelowDegreeBoundry{

						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry90Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(90 - .1);	//input value
							
							double sinResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							sinResult = Sin.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, sinResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry180Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(180 - .1);	//input value
							
							double sinResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							sinResult = Sin.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, sinResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry270Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(270 - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .00001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry360Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(360 - .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .1);
						}
					}
					
					@Nested
					@DisplayName("Just Above")
					class PostiveJustAboveDegreeBoundry{
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry90Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(90 + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry180Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(180 + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry270Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(270 + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult,.00001);
						}
						
						@Test
						void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry360Degrees() {
							//assign
							IAngleMeasurement angle = new DegreeMeasurement(360 + .1);	//input value
							
							double cosResult;		//holds result of Sin.calculate
							double mathCosResult;	//holds result of Math.sin from java library
							
							//act
							cosResult = Cos.calculate(angle);
							mathCosResult = Math.cos(angle.getRadianMeasurement());
							
							//assert
							Assertions.assertEquals(mathCosResult, cosResult, .0000001);
						}
					}
					
				}
			}
				
			/*
			 * Greater than 360 test. 
			 */
			@Nested
			@DisplayName("Out of 360 Test")
			class WhenOutOf360Test{
				
				@Nested
				@DisplayName("Radian Test")
				class RadianOutOf360Test{
					
					@Test
					void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveGreaterThan2PiRadians() {
						//assign
						IAngleMeasurement angle = new RadianMeasurement(550*Math.PI);	//input value
						
						double cosResult;		//holds result of Sin.calculate
						double mathCosResult;	//holds result of Math.sin from java library
						
						//act
						cosResult = Cos.calculate(angle);
						mathCosResult = Math.cos(angle.getRadianMeasurement());
						
						//assert
						Assertions.assertEquals(mathCosResult, cosResult,.0000001);
					}
					
					@Test
					void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveLessThan0Radians() {
						//assign
						IAngleMeasurement angle = new RadianMeasurement(Math.PI);	//input value
						
						double cosResult;		//holds result of Sin.calculate
						double mathCosResult;	//holds result of Math.sin from java library
						
						//act
						cosResult = Cos.calculate(angle);
						mathCosResult = Math.cos(angle.getRadianMeasurement());
						
						//assert
						Assertions.assertEquals(mathCosResult, cosResult,.0000001);
					}
				}
				
				@Nested
				@DisplayName("Degree Test")
				class DegreeOutOf360Test{
					@Test
					void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveGreaterThan360Degrees() {
						//assign
						IAngleMeasurement angle = new DegreeMeasurement(550);	//input value
						
						double cosResult;		//holds result of Sin.calculate
						double mathCosResult;	//holds result of Math.sin from java library
						
						//act
						cosResult = Cos.calculate(angle);
						mathCosResult = Math.cos(angle.getRadianMeasurement());
						
						//assert
						Assertions.assertEquals(mathCosResult, cosResult, .0000001);
					}
					
					@Test
					void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveLessThanNeg360Degrees() {
						//assign
						IAngleMeasurement angle = new DegreeMeasurement(-361);	//input value
						
						double cosResult;		//holds result of Sin.calculate
						double mathCosResult;	//holds result of Math.sin from java library
						
						//act
						cosResult = Cos.calculate(angle);
						mathCosResult = Math.cos(angle.getRadianMeasurement());
						
						//assert
						Assertions.assertEquals(mathCosResult, cosResult, .000001);
					}
				}
			}
			
			
			/*
			 * Whole Equivalence Partition Test
			 */
			@Nested
			@DisplayName("Whole Equivalence Partition Test")
			class WhenWholeEquivalencePartitionTest{
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant1() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(45);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .0000001);
				}
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant2() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(135);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .0000001);
				}
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant3() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(225);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .0000001);
				}
				
				@Test
				void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant4() {
					//assign
					IAngleMeasurement angle = new DegreeMeasurement(315);	//input value
					
					double cosResult;		//holds result of Sin.calculate
					double mathCosResult;	//holds result of Math.sin from java library
					
					//act
					cosResult = Cos.calculate(angle);
					mathCosResult = Math.cos(angle.getRadianMeasurement());
					
					//assert
					Assertions.assertEquals(mathCosResult, cosResult, .001);
				}

			}
		}
}
