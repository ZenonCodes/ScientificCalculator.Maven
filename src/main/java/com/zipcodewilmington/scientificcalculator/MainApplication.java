package com.zipcodewilmington.scientificcalculator;

import static java.lang.Math.PI;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
    /**
     * calcSin method takes one int and returns a double.
     *  User enters in an integer from 0 to 90 representing their
     *  sin's angle in degrees and the method returns a sin value rounded 4 decimal places.
     *
     *  References:https://www.w3schools.com/java/java_try_catch.asp
     *             https://sciencenotes.org/downloadable-trig-table-pdf/

    public static double calcSin(int angle){
        int radianToDegrees = (int) ((angle * 180)/ PI);
        if (angle < 0 || angle > 90) {
            throw new ArithmeticException("This calculator can only calculate Sine for angles 0-90!");
        }
        double sinAns = 0;
        switch (radianToDegrees){
            case 0: sinAns = .0000 ;
                break;
            case 1: sinAns = .0175;
                break;
            case 2: sinAns = .0349;
                break;
            case 3: sinAns = .0523;
                break;
            case 4: sinAns = .0698;
                break;
            case 5: sinAns = .0872;
                break;
            case 6: sinAns = .1045 ;
                break;
            case 7: sinAns = .1219 ;
                break;
            case 8: sinAns = .1392 ;
                break;
            case 9: sinAns = . ;
                break;
            case 10: sinAns = ;
                break;
            case 11: sinAns = ;
                break;
            case 12: sinAns = ;
                break;
            case 13: sinAns = ;
                break;
            case 14: sinAns = ;
                break;
            case 15: sinAns = ;
                break;
            case 16: sinAns = ;
                break;
            case 17: sinAns = ;
                break;
            case 18: sinAns = ;
                break;
            case 19: sinAns = ;
                break;
            case 20: sinAns = ;
                break;
            case 21: sinAns = ;
                break;
            case 22: sinAns = ;
                break;
            case 23: sinAns = ;
                break;
            case 24: sinAns = ;
                break;
            case 25: sinAns = ;
                break;
            case 26: sinAns = ;
                break;
            case 27: sinAns = ;
                break;
            case 28: sinAns = ;
                break;
            case 29: sinAns = ;
                break;
            case 30: sinAns = ;
                break;
            case 31: sinAns = ;
                break;
            case 32: sinAns = ;
                break;
            case 33: sinAns = ;
                break;
            case 34: sinAns = ;
                break;
            case 35: sinAns = ;
                break;
            case 36: sinAns = ;
                break;
            case 37: sinAns = ;
                break;
            case 38: sinAns = ;
                break;
            case 39: sinAns = ;
                break;
            case 40: sinAns = ;
                break;
            case 41: sinAns = ;
                break;
            case 42: sinAns = ;
                break;
            case 43: sinAns = ;
                break;
            case 44: sinAns = ;
                break;
            case 45: sinAns = ;
                break;
            case 46: sinAns = ;
                break;
            case 47: sinAns = ;
                break;
            case 48: sinAns = ;
                break;
            case 49: sinAns = ;
                break;
            case 50: sinAns = ;
                break;
            case 51: sinAns = ;
                break;
            case 52: sinAns = ;
                break;
            case 53: sinAns = ;
                break;
            case 54: sinAns = ;
                break;
            case 55: sinAns = ;
                break;
            case 56: sinAns = ;
                break;
            case 57: sinAns = ;
                break;
            case 58: sinAns = ;
                break;
            case 59: sinAns = ;
                break;
            case 60: sinAns = ;
                break;
            case 61: sinAns = ;
                break;
            case 62: sinAns = ;
                break;
            case 63: sinAns = ;
                break;
            case 64: sinAns = ;
                break;
            case 65: sinAns = ;
                break;
            case 66: sinAns = ;
                break;
            case 67: sinAns = ;
                break;
            case 68: sinAns = ;
                break;
            case 69: sinAns = ;
                break;
            case 70: sinAns = ;
                break;
            case 71: sinAns = ;
                break;
            case 72: sinAns = ;
                break;
            case 73: sinAns = ;
                break;
            case 74: sinAns = ;
                break;
            case 75: sinAns = ;
                break;
            case 76: sinAns = ;
                break;
            case 77: sinAns = ;
                break;
            case 78: sinAns = ;
                break;
            case 79: sinAns = ;
                break;
            case 80: sinAns = ;
                break;
            case 81: sinAns = ;
                break;
            case 82: sinAns = ;
                break;
            case 83: sinAns = ;
                break;
            case 84: sinAns = ;
                break;
            case 85: sinAns = ;
                break;
            case 86: sinAns = ;
                break;
            case 87: sinAns = ;
                break;
            case 88: sinAns = ;
                break;
            case 89: sinAns = ;
                break;
            case 90: sinAns = ;
                break;

        }
     */

    }
}
