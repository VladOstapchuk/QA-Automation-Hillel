package org.HomeWorksQAAutomationJava;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class HomeWork4Calculator {

    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);  //// entering numbers and actions from console
        double firstNumber, secondNumber;
        String symbol;

        System.out.println("Hi! Calculator have next function: adding, subtraction, multiplication, division and percentage calculation.");
        System.out.println("You need enter 2 values and action symbol");
        System.out.println("Let's go!");

        System.out.println("Please, enter first number and press Enter:");
        firstNumber = console.nextInt();

        System.out.println("Please, enter second number and press Enter:");
        secondNumber = console.nextInt();

        System.out.println("Please, enter action symbol and press Enter:");
        System.out.println("You can enter +, -, /, *, %");
        symbol = console.next();

        //check division by ZERO
        if (CalcMethods.checkZero(secondNumber, symbol) == false) {
            System.out.println("Wrong action! Division by ZERO is impossible! Try again!");
            System.exit(0);
        }

        // calculation
        System.out.println("calculation result: " + CalcMethods.calculator(firstNumber, secondNumber, symbol));


    }

}
