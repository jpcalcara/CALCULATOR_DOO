package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class DivisionTest {

    public void testEvaluate() {
        XNumber left = new Number(20);
        XNumber right = new Number(5);
        
        Division instance = new Division();
        
        XNumber expResult = new Number(4);
        
        XNumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    public void testGetOperationDescription() {
        XNumber left = new Number(10);
        XNumber right = new Number(5);
        
        Division instance = new Division();
        
        XNumber expResult = new Number(5);
        
        XNumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
