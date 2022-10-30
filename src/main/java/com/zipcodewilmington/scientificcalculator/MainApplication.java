package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        // create an object of Scanner class
        double result;
        Scanner input = new Scanner(System.in);
        double number1 = 0;
        double number2 = 0;
        double degrees = 45.0;

        // ask users to enter operator
        System.out.println("Choose an operator: +, -, *, / , sqrt , pow, Inverse , sineValue, cosValue, tanValue");
        String operator = input.next();
      //  char operator = input.next().charAt(0);
        // ask users to enter numbers
        System.out.println("Enter first number");
         number1 = input.nextDouble();

         //if(operator == "+" || operator == "-" || operator == "*" || operator == "/" || operator == "pow") {
        if(operator .equals("+") || operator .equals("-") || operator .equals("*") || operator.equals("/") || operator.equals("pow")) {
             System.out.println("Enter second number");
             number2 = input.nextDouble();
         }

        Console obj1 = new Console ();

        switch (operator) {

            // performs addition between numbers
            case "+":
                result = obj1.add(number1,number2);
                System.out.println(number1 + " + " + number2 + " = " + result);
                display(result);
                break;

          // performs subtraction between numbers
            case "-":
                result =  obj1.subtraction(number1,number2);
                System.out.println(number1 + " - " + number2 + " = " + result);
                display(result);
                break;

            // performs multiplication between numbers
            case "*":
                result =  obj1.multiplication(number1,number2);
                System.out.println(number1 + " * " + number2 + " = " + result);
                display(result);
                break;

            // performs division between numbers
            case "/":
                result =  obj1.division(number1,number2);
                System.out.println(number1 + " / " + number2 + " = " + result);
                display(result);
                break;

         // performs Square root
            case "sqrt":
                result =  obj1.squareRoot(number1);
                System.out.println(number1 + " Square root of " + " = " + result);
                display(result);
                break;
            case "pow":
                result = Math.pow(number1, number2);
                System.out.println(number1 + "to the power of " + number2 + " = " + result);
                display(result);
                break;
            case "Inverse":
                result = (1/number1);
                System.out.println(number1 + "Inverse  of " + " = " + result);
                display(result);
                break;
            case "sineValue":
                result = obj1.sineValue(degrees);
                System.out.println( " sin(" + degrees + ") = " + result);
                display(result);
                break;
            case "cosValue":
                result = obj1.cosValue(degrees);
                System.out.println( " cos(" + degrees + ") = " + result);
                display(result);
                break;
            case "tanValue":
                result = obj1.tanValue(degrees);
                System.out.println( " tan(" + degrees + ") = " + result);
                display(result);
                break;

            case "negative":
                result = number1 * (-1);
                System.out.println(number1 + " negative of a number is " + " = " + result);

                default:
                System.out.println("Invalid operator!");
                break;
        }



        input.close();
    }

    private static void display(double currDisp) {
        System.out.println(" Current Display Number " + currDisp);


    }
}














        /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */




