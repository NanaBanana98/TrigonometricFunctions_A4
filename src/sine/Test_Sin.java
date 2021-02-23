package sine;
import general.*;
import org.junit.jupiter.api.*;



class Test_Sin {
	

//Testing calculate method in Sin
	
	/***CARTESIAN BOUNDRY***/
	
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry0Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(0);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN DEGREES***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry90Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(90);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry180Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(180);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry270Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(270);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry360Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(360);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN RADIANS***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryPIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(Math.PI/2);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryPIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry3PIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement((3*Math.PI)/2);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundry2PIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(2*Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN NEGATIVE DEGREES***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg90Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(-90);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg180Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(-180);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg270Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(-270);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg360Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(-360);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN RADIANS***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNegPIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(-Math.PI/2);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNegPIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(-Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg3PIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(-(3*Math.PI)/2);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsCartesianBoundryNeg2PIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(-2*Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***JUST BELOW CARTESIAN BOUNDRY***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry0Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(0 - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN DEGREES***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry90Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(90 - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry180Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(180 - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry270Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(270 - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry360Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(360 - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***CARTESIAN BOUNDRIES IN RADIANS***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundryPIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( (Math.PI/2) - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundryPIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(Math.PI - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry3PIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( ((3*Math.PI)/2) - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustBelowCartesianBoundry2PIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( (2*Math.PI) - .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***JUST ABOVE CARTESIAN BOUNDRY***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry0Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(0 +.1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***JUST ABOVE CARTESIAN BOUNDRIES IN DEGREES***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry90Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(90 + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry180Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(180 + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry270Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(270 + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry360Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(360 + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***JUST ABOVE CARTESIAN BOUNDRIES IN RADIANS***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundryPIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( (Math.PI/2) + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundryPIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(Math.PI + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry3PIover2Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( ((3*Math.PI)/2) + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsJustAboveCartesianBoundry2PIradians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement( (2*Math.PI) + .1);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	/***EQUIVLENCE PARTIONING, positive, non-decimal value from each quadrant (in degrees)***/
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant1() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(45);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant2() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(135);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant3() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(225);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsAPositiveNonDecimalDegreeFromQuadrant4() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(315);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveGreaterThan360Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(550);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveLessThan0Degrees() {
		//assign
		IAngleMeasurement angle = new DegreeMeasurement(-550);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveGreaterThan2PiRadians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(550*Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
	
	@Test
	void calculateShould_MatchSinFromJavaLibrary_WhenAngleIsPositiveLessThan0Radians() {
		//assign
		IAngleMeasurement angle = new RadianMeasurement(-550*Math.PI);	//input value
		
		double sinResult;		//holds result of Sin.calculate
		double mathSinResult;	//holds result of Math.sin from java library
		
		//act
		sinResult = Sin.calculate(angle);
		mathSinResult = Math.sin(angle.getRadianMeasurement());
		
		//assert
		Assertions.assertEquals(mathSinResult, sinResult);
	}
}
