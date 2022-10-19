package org.example.test;

import org.example.calculator.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    @Test
    public void shouldReturnSumWhenAddArrayIsCalled() {
        float[] array = {3, 4, 45, 6.7f, 12, 4.2f, 8.9f};

        Calculator calculator = new Calculator();
        float result = calculator.addArray(array);

        Assertions.assertEquals(82, result);

    }
}