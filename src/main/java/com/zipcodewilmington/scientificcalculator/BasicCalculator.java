package com.zipcodewilmington.scientificcalculator;


import java.util.Scanner;

public class BasicCalculator {
    double num1 = 0.0;
    double num2 = 0.0;
    static char op;
    static double result = 0.0; //current  state displayed on calculator, call this variable before every test
    static Scanner scan;

//This I was trying to input operation from user, but in TestClass I had difficulty in implementing
/* public int getUserNeed() {
        scan= new Scanner(System.in);
        System.out.println("Please enter the operations: 1:Addition,2:Sub,3:Mul,4:Div");
        int op=scan.nextInt();
        System.out.println("Please enter the operat:"+op);
        return op;
}
*/

    /**
     * @param op   : used for operations like +,-,* and /
     * @param num1 : input number1
     * @param num2 : input number 2
     * @return : Returns the result of all 4 operations depending on the 'op' is passed
     */
    public double basicOperations ( char op, double num1, double num2 ) {
//Similarly this to prompt user input
//       Scanner scan=new Scanner(System.in);
//      System.out.println("Please enter number1");
//         num1= scan.nextDouble();
//      System.out.println("Please enter number2");
//       num2=scan.nextDouble();
        if (op == '+') {
            result = num1 + num2;
        } else if (op == '-') {
            result = num1 - num2;
        } else if (op == '*') {
            double mul = num1 * num2;
            result = Double.parseDouble(String.format("%.2f", mul));
        } else if (op == '/') {
             if(num2!=0) {
                 double div = num1 / num2;
                 result = Double.parseDouble(String.format("%.2f", div));
             }
               else{
                 System.out.println("Divide by zero error encountered");
             }
        } else {
            System.out.println("please enter proper operation");
        }
        return result;
    }

    /**
     * @param x --> This Parameter is input for the square
     * @return --> square of the input number
     */
    public double getSquare ( double x ) {
        return (x * x);
    }

    /**
     * @param x --> This parameter is input for the squareroot
     * @return -> Returns the squareroot of the input provided
     */
    public double getSquareRoot ( double x ) {
        return Math.sqrt(x);
    }

    /**
     * @param x ->This Parameter is base
     * @param y --> This Parameter is exponent
     * @return --> returns x^y;
     */
    public double getExponentiation ( double x, double y ) {
        return Math.pow(x, y);
    }

    /**
     * @param x --> Input parameter
     * @return -> return the inverse of  input parameter
     */
    public double getInverseOfNumber ( double x ) {
        double res = 0.0;

        if (x!=0) {
            res = (1 / x);
        } else {
            System.out.println("Divide by Zero error encountered");

        }
        return res;
    }
}