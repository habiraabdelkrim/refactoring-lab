package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
    @Test
    public void testCalc() {
        Calculator calc = new Calculator();
        
        // لاختبار القيم a = 3 و b = 2
        double result = calc.calc(3.0, 2.0);
        
        // حساب القيمة يدويًا: 
        // x = 3 + 2 = 5
        // y = 3 * 2 = 6
        // النتيجة المتوقعة = 5 / 6 = 0.8333...
        assertEquals(0.8333, result, 0.0001);
    }
}

