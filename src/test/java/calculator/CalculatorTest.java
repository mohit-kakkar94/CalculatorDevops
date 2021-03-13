package calculator;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {

		private App calculator;
	    
	    @Before
	    public void setUp() {
	        calculator = new App();
	    }

		@Test
	    public void testLog() {
	        double a = 15.0;
	       
	        double expectedResult = 2.7080502011;
	        double result = calculator.Log(a);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
		
		@Test
		public void testSqrt() {
			double a = 16;
	        
	        double expectedResult = 4;
	        double result = calculator.Sqrt(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testPower() {
			double a = 2;
	        double b = 3;
	        double expectedResult = 8;
	        double result = calculator.Power(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		@Test
		public void testFactorial() {
			int a = 5;
	        long expectedResult = 120;
	       
	        double result = calculator.Factorial(a);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		
		// negative number sqrt,log,factorial exception
		
		
		/*@Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        int a = 25;
	        int b = 0;
	        calculator.Divide(a, b);
	    }*/
}
