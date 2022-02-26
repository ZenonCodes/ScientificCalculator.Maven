package com.zipcodewilmington.scientificcalculator;

import org.junit.Assert;
import org.junit.Test;



public class BasicCalculatorTest {
         @Test
        public void addTest(){
             BasicCalculator test=new BasicCalculator();
             int expected=10; //addition
             double  actual =test.basicOperations(1,5,5);
             double delta=expected - actual;
             Assert.assertEquals(expected,actual,delta);
         }
}