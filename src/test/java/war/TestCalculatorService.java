package war;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import org.junit.jupiter.api.Test;

public class TestCalculatorService {
        @Test
        public void testForPositiveNumber() {
                CalculatorService calculatorService = new CalculatorService();
                assertEquals(true, calculatorService.checkPositive(10000));
                assertNotEquals(true, calculatorService.checkPositive(-10001));
                // kill mutation #1
                assertEquals(true, calculatorService.checkPositive(0));
        }

        @Test
        public void testForNegativeNumber() {
                CalculatorService calculatorService = new CalculatorService();
                assertEquals(true, calculatorService.checkNegative(-210000));
                assertNotEquals(true, calculatorService.checkNegative(210009));
                // kill mutation #1
                assertEquals(true, calculatorService.checkNegative(0));
        }

        @Test
        public void testForEvenNumber() {
                CalculatorService calculatorService = new CalculatorService();
                assertEquals(true, calculatorService.checkEvenNumber(410000));
                assertEquals(true, calculatorService.checkEvenNumber(-221144));

                assertNotEquals(true, calculatorService.checkEvenNumber(410001));
                assertNotEquals(true, calculatorService.checkEvenNumber(-221149));
        }

        @Test
        public void testForOddNumber() {
                CalculatorService calculatorService = new CalculatorService();
                assertEquals(true, calculatorService.checkOddNumber(12345));
                assertEquals(true, calculatorService.checkOddNumber(-232323));

                assertNotEquals(true, calculatorService.checkOddNumber(12348));
                assertNotEquals(true, calculatorService.checkOddNumber(-232316));
        }

        @Test
        public void testForPrimeNumber() {
                CalculatorService calculatorService = new CalculatorService();
                // 12345 is not prime
                assertEquals(false, calculatorService.checkWhetherPrimeOrNot(12345));
                // 232323 is not prime
                assertEquals(false, calculatorService.checkWhetherPrimeOrNot(-232323));
                // 9839 is prime
                assertEquals(true, calculatorService.checkWhetherPrimeOrNot(-9839));
        }

}
