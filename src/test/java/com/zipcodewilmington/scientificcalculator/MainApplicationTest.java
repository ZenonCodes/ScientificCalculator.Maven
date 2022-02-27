package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
class MainApplicationTest {

//    void main() { //main method not needed for test classs
        BasicCalculator test = new BasicCalculator();
        @Test
         void additionTest () {
            double expectedAddition = 30;
            double additionResult = test.basicOperations("+",10,20);
//            int additionResult = newCalculatorTest.add(addTestA, addTestB);
            Assertions.assertEquals(expectedAddition, additionResult);
        //Change for all tests - basicoperations for all basic tests except inverse
        }
        @Test
        void inverseTest () {
            String expectedInverse = "1/30.0";
            String inverseResult = test.getInverseOfNumber(30);
            Assertions.assertEquals(expectedInverse, inverseResult);
        }
        @Test
        void squareTest () {
            double expectedSquareValue = 16.0;
            double squareResult = test.basicOperations("SQ", 4,0);
        }
//        @Test
//        public void testSubtraction () {
//            int subtractionTestA = 30;
//            int subtractionTestB = 20;
//            int expectedSubtraction = 10;
//
////            int subtractionResult = newCalculatorTest.subtract(subtractionTestA, subtractionTestB);
//            Assertions.assertEquals(expectedSubtraction, subtractionResult);
//        }
//        @Test
//        public void testMultiply () {
//            int multiplyTestA = 10;
//            int multiplyTestB = 20;
//            int expectedMultiply = 200;
//
//            int multiplyResult = newCalculatorTest.multiply(multiplyTestA, multiplyTestB);
//            Assertions.AssertEquals(expectedMultiply, multiplyResult);
//        }
//        @Test
//        public void testDivision () {
//            int divisionTestA = 20;
//            int divisionTestB = 10;
//            int expectedDivision = 2;
//
//            int divisionResult = newCalculatorTest.division(divisionTestA, divisionTestB);
//            Assert.AssertEquals(expectedDivision, divisionResult);
//        }
//        @Test
//        public void testSquare () {
//            int squaredNumberA = 4;
//            int squaredPowerB = 2;
//            int expectedSquareExpected = 16;
//
//            int squaredResult = newCalculatorTest.getSquare(squaredNumberA, squaredPowerB);
//            Assert.AssertEquals(expectedSquareExpected, squaredResult);
//        }
//        @Test
//        public void testSquareRoot () {
//            int squareRootTestA = 4;
//            int squareRootTestB = 2;
//            int expectedSquareRoot = 2;
//
//            int squareRootResult = newCalculatorTest.getSquareRoot(squareRootTestA, squareRootTestB);
//            Assert.AssertEquals(expectedSquareRoot, squareRootResult);
//        }
//        @Test
//        public void testXtotheY () {
//            int xForTheY = 4;
//            int yForTheX = 2;
//            int expectedVariableProductResult = 16;
//
//            int variableProductResult = newCalculatorTest.getExponentiation(xForTheY, yForTheX);
//            Assert.AssertEquals(expectedVariableProductResult, variableProductResult);
//        }
//        @Test
//        public void testInverseX () {
//            int inverseXValue = 5;
//            double expectedInverseResult = 1/5;
//
//            int inverseResult = newCalculatorTest.getInverseOfNumber(inverseXValue);
//            Assert.AssertEquals(expectedInverseResult, inverseResult);
//        }
//        @Test
//        public void testSineX () {
//            double testSineValueRadians = 0.19 * Math.PI;
//            double expectedSineX = 83/144;
//
//            double sineResult = newCalculatorTest.sine(sineValueRadians);
//            Assert.AssertEquals(expectedSineX, sineResult);
//        }
//        @Test
//        public void testCosineX () {
//            double testCosineValueRadians = 0.19 * Math.PI;
//            double expectedCosineX = Math.sqrt(3) / 2;
//
//            double cosineResult = newCalculatorTest.cosine(cosineValueRadians);
//            Assert.AssertEquals(expectedCosineX, cosineResult);
//        }
//        @Test
//        public void testTangentX () {
//            double testTangentValueRadians = Math.PI / 6;
//            double expectedTangentX = Math.sqrt(3) / 3;
//
//            double tangentResult = newCalculatorTest.tangent(testTangentValueRadians);
//            Assert.AssertEquals(expectedTangentX, tangentResult);
//        }
//        @Test
//        public void testFactorial() {
//            double testFactorialValue = 5;
//            double expectedFactorialResult = 120;
//
//            double factorialResult = newCalculatorTest.factorial(testFactorialValue);
//            Assert.AssertEquals(expectedFactorialResult, factorialResult);
//
//        }
    }

