package com.zipcodewilmington.scientificcalculator;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    /**
     * calcSin method takes two doubles opposite and hypotenuse.
     *  It divides opposite by hypotenuse and returns the double sin.
     *  If hyp = 0, it returns "impossible"
     *  Reference:https://www.w3schools.com/java/java_try_catch.asp
     */
    static double calcSin(double opp, double hyp){
        if (hyp == 0) {
            throw new ArithmeticException("Impossible! You can't divide by zero.");
        }

        double sin = opp/hyp;
        return sin;
    }
    public static void main(String[] args) {
        Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d);
    }
}
