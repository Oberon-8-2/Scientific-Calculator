package com.zipcodewilmington.scientificcalculator;
import java.util.Scanner;

import static com.zipcodewilmington.scientificcalculator.Console.*;

/**
 * Created by leon on 2/9/18.
 */
public class MainApplication {
    public static void main(String[] args) {
        char operator;
        double total;
        Double num1, num2, result;
        Scanner input = new Scanner(System.in);
        String nextAction = "continue";

        while (nextAction.equals("continue")) {

            System.out.println("What kinda math you wanna do? +, -, *, or / \nOr something more involved? > for square root, ^ for exponents, _ for inverse, and ~ for negative");
            operator = input.next().charAt(0);


            if (operator == '+') {
                System.out.println("What's your first number?");
                double number1 = input.nextDouble();
                System.out.println("What's your second number?");
                double number2 = input.nextDouble();
                total = add(number1, number2);
                System.out.println(total);
            } else if (operator == '-') {
                System.out.println("What's your first number?");
                double number1 = input.nextDouble();
                System.out.println("What's your second number?");
                double number2 = input.nextDouble();
                total = subtraction(number1, number2);
                System.out.println(total);
            } else if (operator == '*') {
                System.out.println("What's your first number?");
                double number1 = input.nextDouble();
                System.out.println("What's your second number?");
                double number2 = input.nextDouble();
                total = multiplication(number1, number2);
                System.out.println(total);
            } else if (operator == '/') {
                System.out.println("What's your first number?");
                double number1 = input.nextDouble();
                System.out.println("What's your second number?");
                double number2 = input.nextDouble();
                if (number2 != 0) {

                    total = division(number1, number2);
                    System.out.println(total);
                } else if (number2 == 0) {
                    System.out.println("error");
                }


            } else if (operator == '>') {
                System.out.println("What's your number?");
                double number1 = input.nextDouble();
                total = squareRoot(number1);
                System.out.println(total);
            } else if (operator == '^') {
                System.out.println("What's your number?");
                double number1 = input.nextDouble();
                System.out.println("By the power of?");
                double number2 = input.nextDouble();
                total = exponentiation(number1, number2);
                System.out.println(total);
            } else if (operator == '_') {
                System.out.println("What's your number?");
                double number1 = input.nextDouble();
                total = inverse(number1);
                System.out.println(total);
            } else if (operator == '~') {
                System.out.println("What's your number?");
                double number1 = input.nextDouble();
                total = negative(number1);
                System.out.println(total);
            }
            System.out.println("Exit, or continue?");
            nextAction = input.next();


        }
    }
}















        /* Console.println("Welcome to my calculator!");
        String s = Console.getStringInput("Enter a string");
        Integer i = Console.getIntegerInput("Enter an integer");
        Double d = Console.getDoubleInput("Enter a double.");

        Console.println("The user input %s as a string", s);
        Console.println("The user input %s as a integer", i);
        Console.println("The user input %s as a d", d); */




