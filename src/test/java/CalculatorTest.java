import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void add() {
         // Умножение положительных: 3 * 2.5 = 7.5
        assertEquals(7.5, Calculator.calculate(3, 2.5, "*"), DELTA);

        // Умножение на ноль: -5 * 0 = 0
        assertEquals(0, Calculator.calculate(-5, 0, "*"), DELTA);
    }

    @Test
    void dif() {
        //TODO inser your realisation in test-method dif
    }

    @Test
    void div() {
        //TODO inser your realisation in test-method div
    }

    @Test
    void times() {
        //TODO inser your realisation in test-method times
    }

    @Test
    void solver() {
        //TODO inser your realisation in test-method solver
    }
}
