import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(10, 5, 3.5, 7.5);
    }

    @Test
    public void hasNumberOne() {
        assertEquals(10, calculator.getNumberOne());
    }

    @Test
    public void hasNumberTwo() {
        assertEquals(5, calculator.getNumberTwo());
    }

    @Test
    public void hasNumberTwoDouble(){
        assertEquals(7.5, calculator.getNumberTwoDouble(), 0.1);
    }

    @Test
    public void hasNumberOneDouble(){
        assertEquals(3.5, calculator.getNumberOneDouble(), 0.1);
    }

    @Test
    public void addNumberOneToNumberTwo(){
        assertEquals(15, calculator.add(10, 5));
    }

    @Test
    public void subtractNumberTwoFromNumberOne(){
        assertEquals(5, calculator.subtract(10, 5));
    }

    @Test
    public void multiplyNumberOneToNumberTwo(){
        assertEquals(50, calculator.multiply(10, 5));
    }
}
