package com.zipcodewilmington.scientificcalculator;

public class Factorial {
    public static int factorial (int n){
        if (n < 0){
            throw new ArithmeticException("Factorial must be zero or a positive integer.");
        }
        if (n == 0) {
            return 1;
        }
        if (n == 1) {
            return 1;
        }
       return (n * factorial(n-1));
    }
}
