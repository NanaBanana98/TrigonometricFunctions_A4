package TestGeneral;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import general.*;
import general.Maths;

class Test_DegreeMeasurement {


	@Nested
	@DisplayName("Test getRadian")
	class Test_GetRadians{
		
		@Test
		void when0Degrees_return0() {
			IAngleMeasurement a = new DegreeMeasurement(0);
			Assertions.assertEquals(a.getRadianMeasurement(), 0, .00001);
		}
		
		@Test
		void when90Degrees_returnPIby2() {
			IAngleMeasurement a = new DegreeMeasurement(90);
			Assertions.assertEquals(a.getRadianMeasurement(), (Math.PI/2), .00001);
		}
		
		@Test
		void when180Degrees_returnPI() {
			IAngleMeasurement a = new DegreeMeasurement(180);
			Assertions.assertEquals(a.getRadianMeasurement(),Math.PI, .00001);
		}
		
		@Test
		void when360Degrees_return2PI() {
			IAngleMeasurement a = new DegreeMeasurement(360);
			Assertions.assertEquals(a.getRadianMeasurement(), 2*Math.PI, .00001);
		}
		
		@Test
		void when45Degrees_returnRadianValFromMathLib() {
			IAngleMeasurement a = new DegreeMeasurement(45);
			Assertions.assertEquals(a.getRadianMeasurement(), Math.toRadians(45), .00001);
		}
		
	}
	
	
	@Nested
	@DisplayName("Test getDegree")
	class Test_GetDegerees{
		
		@Test
		void when0Degrees_return0() {
			IAngleMeasurement a = new DegreeMeasurement(0);
			Assertions.assertEquals(a.getRadianMeasurement(), 0, .00001);
		}
		
		@Test
		void when90Degrees_return90() {
			IAngleMeasurement a = new DegreeMeasurement(90);
			Assertions.assertEquals(a.getDegreeMeasurement(), 90, .00001);
		}
		
		@Test
		void when180Degrees_return180() {
			IAngleMeasurement a = new DegreeMeasurement(180);
			Assertions.assertEquals(a.getDegreeMeasurement(),180, .00001);
		}
		
		@Test
		void when360Degrees_return360() {
			IAngleMeasurement a = new DegreeMeasurement(360);
			Assertions.assertEquals(a.getDegreeMeasurement(), 360, .00001);
		}
		
		@Test
		void when45Degrees_return45() {
			IAngleMeasurement a = new DegreeMeasurement(45);
			Assertions.assertEquals(a.getDegreeMeasurement(),45, .00001);
		}
		
	}

}
