package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class SubstractionTest {
    
    public SubstractionTest() {
    }

    public void testEvaluate() {
        XNumber left = new Number(8);
        XNumber right = new Number(5);
        
        Substraction instance = new Substraction();
        
        XNumber expResult = new Number(3);
        
        XNumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    @Test
    public void testGetOperationDescription() {
        XNumber left = new Number(2);
        XNumber right = new Number(1);
        
        Substraction instance = new Substraction();
        
        XNumber expResult = new Number(2);
        
        XNumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
