package com.zipcodewilmington.scientificcalculator;

public class Trig {
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
    // to get ratio and returns inverse sin
    public static double invSin(double opp, double hyp) {
        double sinRatio = opp/hyp;
        return Math.asin(sinRatio);
    }
    // Takes params adj and hyp and divides
    // to get ratio and returns inverse cos
    public static double invCos(double adj, double hyp) {
        double cosRatio = adj/hyp;
        return Math.acos(cosRatio);
    }
    // Takes params opp and adj and divides
    // to get ratio and returns inverse tan
    public static double invTan(double opp, double adj) {
        double tanRatio = opp/adj;
        return Math.atan(tanRatio);
    }
}
