package com.zipcodewilmington.scientific_calculator;
import com.zipcodewilmington.scientificcalculator.Console;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 2/9/18.
 */


/**
 * Created by leon on 2/9/18.

 */
public class TestMainApplication {
    @Test
    public void addTest() {
        double result = Console.add(3, 8);
        double actual = 11.0;
    }
    @Test
    public void subtractionTest() {
        double result = Console.subtraction(8,5);
        double actual = 3.00;
    }
    @Test
    public void multiplicationTest() {
        double result = Console.multiplication(3, 8);
        double actual = 24.00;
    }
    @Test
    public void divisionTest() {
        double result = Console.division(8,2);
        double actual = 4.00;
    }
    @Test
    public void squareRootTest() {
        double result = Console.squareRoot(4);
        double actual = 2.00;
    }
    @Test
    public void exponentiationTest(){
        double result = Console.exponentiation(2,3);
        double actual = 8.00;
    }
    @Test
    public void inverseTest() {
        double result = Console.inverse(4);
        double actual = 1/4;
    }
    @Test
    public void sineValueTest() {
        double result = Console.sineValue(45.0);
        double actual = 0.70;
    }
    @Test
    public void cosValueTest() {
        double result = Console.cosValue(45.0);
        double actual = 0.70;
    }
    @Test
    public void tanValueTest() {
        double result = Console.tanValue(45.0);
        double actual = 0.70;
    }

}


