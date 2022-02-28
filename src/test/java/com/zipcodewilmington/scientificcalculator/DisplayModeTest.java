package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DisplayModeTest {
  DisplayMode disMode=new DisplayMode();
  BasicCalculator test=new BasicCalculator();

    @Test
    void switchDisplayModeBinary () {
        DisplayMode.switchDisplayMode();
        boolean actualBinaryDisplay = DisplayMode.binary;
        Assertions.assertTrue(actualBinaryDisplay);
    }
    @Test
    void switchDisplayModeOctal () {
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        boolean actualOctalDisplay = DisplayMode.octal;
        Assertions.assertTrue(actualOctalDisplay);
    }
    @Test
    void switchDisplayModeDecimal () {
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        boolean actualDecimalDisplay = DisplayMode.decimal;
        Assertions.assertTrue(actualDecimalDisplay);
    }
    @Test
    void switchDisplayModeHexadecimal () {
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        boolean actualHexadecimalDisplay = DisplayMode.hexadecimal;
        Assertions.assertFalse(actualHexadecimalDisplay);
    }
    @Test
    void changeDisplayTestDecimimal() {
        BasicCalculator test = new BasicCalculator();
        double actualOutputDecimal = test.basicOperations("/", 10, 2);
        DisplayMode.changeDisplay();
    }
    @Test
    void changeDisplayTestBinary () {
        DisplayMode.switchDisplayMode();
        double  actualOutputBinaru= test.basicOperations("/", 10,2);
        DisplayMode.changeDisplay();
    }
    @Test
    void changeDisplayTestOctal () {
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        double  actualOutputOctal= test.basicOperations("/", 10,2);
        DisplayMode.changeDisplay();
    }
    @Test
    void changeDisplayTestDecimal () {
        double actualOutputDecimal = test.basicOperations("/",10,2);
        DisplayMode.changeDisplay();
    }
    //Could not get hexadecimal to display, don't see an error in base code or test.
    @Test
    void changeDisplayTestHexadecimal () {
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        DisplayMode.switchDisplayMode();
        double actualOutputHexadecimal = test.basicOperations("/",100,10);
        DisplayMode.changeDisplay();
    }
}