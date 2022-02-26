package com.zipcodewilmington.scientificcalculator;

public class TrigometricFunctions {
    // Takes radian x and returns sin(x)
    public static double calcSin(double angle) {
        return Math.sin(angle);
    }
    // Takes radian x and returns cos(x)
    public static double calcCos(double angle) {
        return Math.cos(angle);
    }
    // Takes radian x and returns tan(x)
    public static double calcTan(double angle) {
        return Math.tan(angle);
    }

    // Takes params opp and hyp and divides
    // to get ratio and returns sin(x)
    public static double invSin(double opp, double hyp) {
        double sinRatio = opp/hyp;
        return Math.asin(sinRatio);
    }
    public static double invCos(double opp, double hyp) {
        double cosRatio = opp/hyp;
        return Math.asin(cosRatio);
    }
    public static double invSin(double opp, double hyp) {
        double tanRatio = opp/hyp;
        return Math.asin(tanRatio);
    }
}
