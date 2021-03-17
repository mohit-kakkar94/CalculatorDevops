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
	    public void testSqeroot() {
	        double a = 4.0;

	        double expectedResult = 2.0;
	        double result = calculator.Sqeroot(a);
	        Assert.assertEquals(expectedResult, result, 0);
	    }
		
		@Test
		public void testFact() {
			Assert.assertEquals(3628800, calculator.Fact(10), 0);
			Assert.assertEquals(Double.NaN, Double.valueOf(calculator.Fact(-5)),0);
		}

	@Test
	public void testLoge() {
		Assert.assertEquals(0.0, calculator.Loge(1.0), 0.0001);
		Assert.assertEquals(Double.NEGATIVE_INFINITY, calculator.Loge(0.0), 0);
	}

		@Test
		public void testPowe() {
			double a = 7;
	        double b = 3;
	        double expectedResult = 343;
	        double result = calculator.Powe(a, b);
	        Assert.assertEquals(expectedResult, result, 0);
		}
		

		
		/*@Test(expected = IllegalArgumentException.class)
	    public void testDivideByZero() {
	        int a = 25;
	        int b = 0;
	        calculator.Divide(a, b);
	    }*/
}
