package Calculator;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by IT_School on 25.12.2015.
 */
public class MathOperationsTest {
    @Test
    public void testSumm(){
        double result = MathOperations.summ(-1,-1);
        Assert.assertEquals(-2,result,0);
    }
    @Test
    public void testDiff(){
        double result = MathOperations.diff(4, -2);
        Assert.assertEquals(6,result,0);
    }
    @Test
    public void testMul(){
        double result = MathOperations.mul(4, -2);
        Assert.assertEquals(-8,result,0);
    }
    @Test
    public void testDiv(){
        double result = MathOperations.div(4,2);
        Assert.assertEquals(2,result,0);
    }
    @Test(expected = java.lang.ArithmeticException.class)
    public void testDivException (){
        double result = MathOperations.div(4,0);
        //Assert.assertEquals("NOt ",0,result,0);
    }
}
