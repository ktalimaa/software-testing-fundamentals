package org.example.calculator;

public class Calculator {
    public float addArray(float[] inputArray) {
        int result = 0;

        for (float input : inputArray) {
            result += input;
        }
        return result;
    }
}
