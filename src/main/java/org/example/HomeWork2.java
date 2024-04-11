package org.example;

import java.io.IOException;
import java.util.Scanner;

public class HomeWork2 {

//    створити масив типу int із 20 елементів.
//    вивести в консоль суму всіх чисел більше 5 і менше 45 (для підрахунку використовувати цикл)
//    вивести у консоль усі парні позитивні числа.

    public static void main(String[] args) {

        int arraylength;            // variable for array length
        int sum = 0;                // variable for sum numbers from 5 up to 45;
        System.out.println("Please enter here array length and press Enter:");
        Scanner console = new Scanner(System.in);              // enter array length from the keyboard (from console)
        arraylength = console.nextInt();

        int[] array = new int[arraylength];

        System.out.println("Array length: " + array.length);  //check array length

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);           //fill the array with random integers from 0 to 100
            System.out.println(array[i]);
            if (array[i] > 5 && array[i] < 45) {              //add all numbers from 5 up to 45 from array
                sum = sum + array[i];
            }
        }

        //made in a separate FOR so that it was more beautiful in the console
        for (int i = 0; i < array.length; i++) {               // output of all even positive numbers to the console
            if (array[i] % 2 == 0 && array[i] > 0) {
                System.out.println("Array element #" + i + ": " + array[i]);
            }
        }
        System.out.println("Sum all number from array from 5 up to 45 IS: " + sum);
    }

}

