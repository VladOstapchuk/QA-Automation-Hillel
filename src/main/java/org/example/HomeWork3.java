package org.example;

import java.util.Scanner;

public class HomeWork3 {
    //Створити масив з 20 елементів типу int. Вивесті в консоль всі елементи масиву у
    // відсортованому винляді в будьяку сторону.

    public static void main(String[] args) {

        int arraylength;
        boolean isChanged = true;
        int transfer;

        System.out.println("Please enter Array length and press Enter: ");
        Scanner console = new Scanner(System.in);
        arraylength = console.nextInt();

        int[] array = new int[arraylength];
        System.out.println("Array before sorting: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            System.out.print(array[i] + " ");
        }


        while (isChanged == true) {
            isChanged = false;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]) {
                    transfer = array[i + 1];
                    array[i + 1] = array[i];
                    array[i] = transfer;
                    isChanged = true;
                }
            }


        }
        System.out.println();
        System.out.println("Array after sorting: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }

}
