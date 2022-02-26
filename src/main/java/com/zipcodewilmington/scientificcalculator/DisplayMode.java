package com.zipcodewilmington.scientificcalculator;

public class DisplayMode {
    static boolean binary = false;
    static boolean octal = false;
    static boolean decimal = false;
    static boolean hexadecimal = false;

    public static void switchDisplayMode(){
        String displayMode = null;
        if (!binary && !octal && !decimal && !hexadecimal){
            displayMode = "binary";
            binary = true;
        } else if (binary == true) {
            displayMode = "octal";
            binary = false;
            octal = true;
        } else if (octal == true) {
            displayMode = "decimal";
            octal = false;
            decimal = true;
        } else if (decimal == true) {
            displayMode = "hexadecimal";
            decimal = false;
            hexadecimal = true;
        } else if (hexadecimal == true) {
            displayMode = "binary";
            hexadecimal = false;
            binary = true;
        }
    }


    public static void switchDisplayMode(String mode){

    }
}
