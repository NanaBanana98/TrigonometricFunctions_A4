package TestGeneral;
import general.*;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

class Test_Maths {

	@Nested
	@DisplayName("Test Factorial")
	class Test_Factorial{
		
		@Test
		void when0_return1() {
			Assertions.assertEquals(Maths.factorial(0), 1);
		}
		
		
		@Test
		void when5_return120() {
			Assertions.assertEquals(Maths.factorial(1), 1);
		}
		
		@Test
		void when1_return1() {
			Assertions.assertEquals(Maths.factorial(5), 120);
		}
		
		@Test
		void whenNegative_return1() {
			Assertions.assertEquals(Maths.factorial(-5), -120);
		}
	}
	
	
	@Nested
	@DisplayName("Test Power")
	class Test_Power{
		
		@Test
		void whenRaised0_return1() {
			Assertions.assertEquals(Maths.power(1,0), 1);
		}
		
		
		@Test
		void when5raised2_return25() {
			Assertions.assertEquals(Maths.power(5,2), 25);
		}
		
		@Test
		void whenNegative_returnDecimal() {
			Assertions.assertEquals(Maths.power(5,-2), 0.04);
		}
		
		@Test
		void whenRasiedTo1_returnBase() {
			Assertions.assertEquals(Maths.power(5,1), 5);
		}
	}



}
