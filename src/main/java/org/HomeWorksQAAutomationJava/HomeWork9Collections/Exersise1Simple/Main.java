package org.HomeWorksQAAutomationJava.HomeWork9Collections.Exersise1Simple;

import javax.xml.transform.sax.SAXResult;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/*
 1 Створити метод countOccurance, що приймає на вхід рядковий список як параметр
 і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись
  у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
*/
public class Main {

    static List<String> list = new ArrayList<>();
    static int count = 0;

    static String toFind;


    public static void main(String[] args) {

        //створюю сканер, щоб слова можна було ввести с клавіатури
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть довільну кількість слів через пробіл та натисніть Enter:");

        //заповнюю ліст - строку з консолі розбиваю по символу "пробіл"
        list.addAll(Arrays.asList(scanner.nextLine().split(" ")));

        System.out.println("Введіть слово, яке шукаємо у списку слів :");
        toFind = scanner.next();

        scanner.close();

        System.out.println("Це слово зустрічається у списку " + countOccurance(list, toFind) + " раз(и)");


//        //перевіряю, що лист заповнений словами (для тесту)
//        for (String string : list) {
//            System.out.println(string);
//        }


    }


    public static int countOccurance(List<String> list, String toFind) {
        for (String string : list){
            if (string.equalsIgnoreCase(toFind)) count++;
        }


        return count;
    }


}
