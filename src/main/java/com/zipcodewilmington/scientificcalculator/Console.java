package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static double add(double number1,double number2){ return number1 + number2; }
    public static double subtraction(double number1,double number2){
        return number1 - number2;
    }
    public static double multiplication(double number1,double number2){
        return number1 * number2;
    }
    public static double division(double number1,double number2){
        return number1 / number2;
    }

    public static double squareRoot(double number){
        return Math.sqrt(number);
    }
    public static double exponentiation(double a,double b){
        return Math.pow(a,b);
    }
    public static double inverse(double x){
        return (1/x);
    }

    //adding negative number
    public static double negative(double x){
        return x * (-1);
    }
}

