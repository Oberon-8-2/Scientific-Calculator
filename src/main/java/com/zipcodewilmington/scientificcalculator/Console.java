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

    public static double add(double number1,double number2){
        return number1 + number2;
    }
    public static double subtraction(double number1,double number2){
        return number1 - number2;
    }
    public static double multiplication(double number1,double number2){
        return number1 * number2;
    }
    public static double division(double number1,double number2){
        return number1 / number2;
    }

    public static double squareRoot(double number1){
        return Math.sqrt(number1);
    }
    public static double exponentiation(double number1,double number2){
        return Math.pow(number1,number2);
    }
    public static double inverse(double number){

        return (1/number);
    }

    //adding negative number
    public static double negative(double number){
        return number * (-1);
    }

    public static double sineValue(double degrees) {
        double radians = Math.toRadians((degrees));
        return degrees = Math.sin(radians);
    }

    public static double cosValue(double degrees) {
        double radians = Math.toRadians((degrees));
        return degrees = Math.cos(radians);
    }
    public static double tanValue(double degrees) {
        double radians = Math.toRadians((degrees));
        return degrees = Math.tan(radians);
    }
}

