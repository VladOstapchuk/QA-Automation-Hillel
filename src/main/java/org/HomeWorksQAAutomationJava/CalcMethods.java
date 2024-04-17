package org.HomeWorksQAAutomationJava;

public class CalcMethods {

    //addition
    private static double sum(double a, double b) {
        return a + b;
    }

    //subtraction
    private static double subtraction(double a, double b) {
        return a - b;
    }

    //multiplication
    private static double multiplication(double a, double b) {
        return a * b;
    }

    //division
    private static double division(double a, double b) {
        return a / b;
    }

    //percent
    private static double percent(double a, double b) {
        return (b / a) * 100;
    }


    //check is second number is 0 and operation is division
    public static boolean checkZero(double secondNumber, String symbol) {
        boolean isTrue = true;
        if (secondNumber == 0 && symbol.equals("/")) {
            isTrue = false;
        }

        return isTrue;
    }

    //Calculator Method
    public static double calculator(double firstNumber, double secondNumber, String symbol) {
        double result = 0;

        switch (symbol) {
            case "+":
                result = sum(firstNumber, secondNumber);
                break;
            case "-":
                result = subtraction(firstNumber, secondNumber);
                break;
            case "/":
                result = division(firstNumber, secondNumber);
                break;
            case "*":
                result = multiplication(firstNumber, secondNumber);
                break;
            case "%":
                result = percent(firstNumber, secondNumber);
                break;

        }

        return result;
    }


}
