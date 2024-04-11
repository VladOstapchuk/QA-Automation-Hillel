package org.example;

import java.util.Scanner;


public class HomeWork3 {
    //Створити масив з 20 елементів типу int. Вивесті в консоль всі елементи масиву у
    // відсортованому винляді в будьяку сторону.

    public static void main(String[] args) {

        int arraylength;                         //array length variable
        boolean isChanged = true;                //monitor for sorting of array
        int transfer;                            //to replace the values of adjacent array cells
        int sort;                                //how to sort array


        System.out.println("Please enter Array length and press Enter: ");
        Scanner console = new Scanner(System.in);  // entering array length from console
        arraylength = console.nextInt();

        int[] array = new int[arraylength];
        System.out.println("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);     //fill the array with random integers from 0 to 100
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println("To sort the array from smallest to largest - press 1.\n" +    //How to sort array?
                "To sort the array from largest to smallest - press 2 :");
        sort = console.nextInt();

        if (sort == 1){
            while (isChanged == true) {                                  //sorting array
                isChanged = false;
                for (int i = 0; i < array.length - 1; i++) {             //we sort the array by comparing adjacent values
                    if (array[i] > array[i + 1]) {
                        transfer = array[i + 1];
                        array[i + 1] = array[i];
                        array[i] = transfer;
                        isChanged = true;
                    }
                }
            }
        }

        if (sort == 2){
            while (isChanged == true) {                                  //sorting array
                isChanged = false;
                for (int i = 0; i < array.length - 1; i++) {             //we sort the array by comparing adjacent values
                    if (array[i] < array[i + 1]) {
                        transfer = array[i];
                        array[i] = array[i+1];
                        array[i+1] = transfer;
                        isChanged = true;
                    }
                }
            }
        }
        else
            System.out.println("Wrong choice, try again");




        System.out.println();
        System.out.println("Array after sorting: ");            //output to the console for sorted array
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
