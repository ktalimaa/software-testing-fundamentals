package org.example.test;

import org.assertj.core.api.Assertions;
import org.example.calculator.Calculator;
import org.example.calculator.Divide;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * Write some AssertJ tests for Calculator methods in a separate file 'AssertCalculatorTest'.
 *
 * @author Kristel Talimaa
 */
public class AssertCalculatorTest {

    public DivideTest divideTest;

    @Test
    public void testDivideList() {
        List<Integer> divide = List.of(10000, 2);

        Assertions.assertThat(divide).hasSize(2)
                .contains(2)
                .startsWith(10000);

    }

}