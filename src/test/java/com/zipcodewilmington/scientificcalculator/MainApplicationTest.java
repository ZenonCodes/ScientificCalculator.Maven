package com.zipcodewilmington.scientificcalculator;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Before; //not sure about this
class MainApplicationTest {

    @org.junit.jupiter.api.Test
    void main() {
        newCalculatorTest = new ScientificCalculator();


        public void testAddition () {
        int addTestA = 10;
        int addTestB = 20;
        int expectedAddition = 30;

        int additionResult = newCalculatorTest.add(addTestA, addTestB);
        Assert.AssertEquals(expectedAddition, additionResult);
        }
        public void testSubtraction () {
            int subtractionTestA = 30;
            int subtractionTestB = 20;
            int expectedSubtraction = 10;

            int subtractionResult = newCalculatorTest.subtract(subtractionTestA, subtractionTestB);
            Assert.AssertEquals(expectedSubtraction, subtractionResult);
        }
        public void testMultiply () {
            int multiplyTestA = 10;
            int multiplyTestB = 20;
            int expectedMultiply = 200;

            int multiplyResult = newCalculatorTest.multiply(multiplyTestA, multiplyTestB);
            Assert.AssertEquals(expectedMultiply, multiplyResult);
        }
    }
}