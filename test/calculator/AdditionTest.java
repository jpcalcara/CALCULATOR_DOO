package calculator;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class AdditionTest {

    public void testEvaluate() {
        XNumber left = new Number(6);
        XNumber right = new Number(7);
        
        Addition instance = new Addition();
        
        XNumber expResult = new Number(13);
        
        XNumber result = instance.evaluate(left, right);
        
        assertEquals(expResult, result);
    }
    public void testEvaluateError() {
        XNumber left = new Number(6);
        XNumber right = new Number(1);
        
        Addition instance = new Addition();
        
        XNumber expResult = new Number(6);
        
        XNumber result = instance.evaluate(left, right);
        
        assertNotEquals(expResult, result);
    }
    
}
