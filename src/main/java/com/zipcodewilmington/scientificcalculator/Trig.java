package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Trig {

    public static double sine(double angle) {
        return Math.sin(angle);
    }
    // Takes radian x and returns cos(x)
    public static double cosine(double angle) {
        return Math.cos(angle);
    }
    // Takes radian x and returns tan(x)
    public static double tangent(double angle) {
        return Math.tan(angle);
    }

    // Takes params opp and hyp and divides
    // to get ratio and returns inverse sin
    public static double inverseSine(double opp, double hyp) {
        double sinRatio = opp/hyp;
        return Math.asin(sinRatio);
    }
    // Takes params adj and hyp and divides
    // to get ratio and returns inverse cos
    public static double inverseCosine(double adj, double hyp) {
        double cosRatio = adj/hyp;
        return Math.acos(cosRatio);
    }
    // Takes params opp and adj and divides
    // to get ratio and returns inverse tan
    public static double inverseTangent(double opp, double adj) {
        double tanRatio = opp/adj;
        return Math.atan(tanRatio);
    }
}
