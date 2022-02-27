package com.zipcodewilmington.scientificcalculator;

import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainApplicationTest {

    @org.junit.jupiter.api.Test
    void main() {
        newCalculatorTest = new ScientificCalculator();

        @Test
        public void testAddition () {
            int addTestA = 10;
            int addTestB = 20;
            int expectedAddition = 30;

            int additionResult = newCalculatorTest.add(addTestA, addTestB);
            Assert.AssertEquals(expectedAddition, additionResult);
        }
        @Test
        public void testSubtraction () {
            int subtractionTestA = 30;
            int subtractionTestB = 20;
            int expectedSubtraction = 10;

            int subtractionResult = newCalculatorTest.subtract(subtractionTestA, subtractionTestB);
            Assert.AssertEquals(expectedSubtraction, subtractionResult);
        }
        @Test
        public void testMultiply () {
            int multiplyTestA = 10;
            int multiplyTestB = 20;
            int expectedMultiply = 200;

            int multiplyResult = newCalculatorTest.multiply(multiplyTestA, multiplyTestB);
            Assert.AssertEquals(expectedMultiply, multiplyResult);
        }
        @Test
        public void testDivision () {
            int divisionTestA = 20;
            int divisionTestB = 10;
            int expectedDivision = 2;

            int divisionResult = newCalculatorTest.division(divisionTestA, divisionTestB);
            Assert.AssertEquals(expectedDivision, divisionResult);
        }
        @Test
        public void testSquare () {
            int squaredNumberA = 4;
            int squaredPowerB = 2;
            int expectedSquareExpected = 16;

            int squaredResult = newCalculatorTest.getSquare(squaredNumberA, squaredPowerB);
            Assert.AssertEquals(expectedSquareExpected, squaredResult);
        }
        @Test
        public void testSquareRoot () {
            int squareRootTestA = 4;
            int squareRootTestB = 2;
            int expectedSquareRoot = 2;

            int squareRootResult = newCalculatorTest.getSquareRoot(squareRootTestA, squareRootTestB);
            Assert.AssertEquals(expectedSquareRoot, squareRootResult);
        }
        @Test
        public void testXtotheY () {
            int xForTheY = 4;
            int yForTheX = 2;
            int expectedVariableProductResult = 16;

            int variableProductResult = newCalculatorTest.getExponentiation(xForTheY, yForTheX);
            Assert.AssertEquals(expectedVariableProductResult, variableProductResult);
        }
        @Test
        public void testInverseX () {
            int inverseXValue = 5;
            double expectedInverseResult = 1/5;

            int inverseResult = newCalculatorTest.getInverseOfNumber(inverseXValue);
            Assert.AssertEquals(expectedInverseResult, inverseResult);
        }
        @Test
        public void testSineX () {
            double sineValueRadians = 0.19 * Math.PI;
            double expectedSineX = 83/144;

            double sineResult = newCalculatorTest.sine(sineValueRadians);
            Assert.AssertEquals(expectedSineX, sineResult);
        }
        @Test
        public void testCosineX () {
            double cosineValueRadians = 0.19 * Math.PI;
            double expectedCosineX = Math.sqrt(3) / 2;

            double cosineResult = newCalculatorTest.cosine(cosineValueRadians);
            Assert.AssertEquals(expectedCosineX, cosineResult);
        }
        @Test
        public void testTangentX () {
            double tangentValueRadians = Math.PI / 6;
            double expectedTangentX = Math.sqrt(3) / 3;

            double tangentResult = newCalculatorTest.tangent(tangentValueRadians);
            Assert.AssertEquals(expectedTangentX, tangentResult);
        }
        @Test
        public void testTangentX () {
            double tangentValueRadians = Math.PI / 6;
            double expectedTangentX = Math.sqrt(3) / 3;

            double tangentResult = newCalculatorTest.tangent(tangentValueRadians);
            Assert.AssertEquals(expectedTangentX, tangentResult);
        }
    }
}
