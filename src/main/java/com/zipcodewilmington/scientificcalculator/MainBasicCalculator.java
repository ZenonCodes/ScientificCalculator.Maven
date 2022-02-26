package com.zipcodewilmington.scientificcalculator;

public class MainBasicCalculator {
    public static void main ( String[] args ) {
        BasicCalculator basicTest=new BasicCalculator();
        System.out.println("Initial state:"+ BasicCalculator.result);

        System.out.println(basicTest.basicOperations('+',5,3));
        System.out.println(basicTest.getInverseOfNumber(5));
    }
}
