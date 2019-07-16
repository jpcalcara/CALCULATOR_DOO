package calculator;

import org.junit.Test;
import static org.junit.Assert.*;

public class MultiplicationTest {

    public void testEvaluate() {
        XNumber left = new Number(4);
        XNumber right = new Number(5);
        
        Multiplication instance = new Multiplication();
        
        XNumber expResult = new Number(20);
        
        XNumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }

    public void testGetOperationDescription() {
        XNumber left = new Number(1);
        XNumber right = new Number(2);
        
        Multiplication instance = new Multiplication();
        
        XNumber expResult = new Number(1);
        
        XNumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
