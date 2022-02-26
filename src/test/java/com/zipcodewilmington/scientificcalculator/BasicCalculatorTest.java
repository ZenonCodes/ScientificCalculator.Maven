package com.zipcodewilmington.scientificcalculator;



import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;


public class BasicCalculatorTest {
         @Test
        public void addTest(){

            BasicCalculator test=new BasicCalculator();
            double expected=3; //addition

            double  actual =test.basicOperations('/', 3,1);
             System.out.println("The actual value:"+actual);

             Assertions.assertEquals(expected,actual);
         }

         @Test
    public void testSqrt(){

         }
}