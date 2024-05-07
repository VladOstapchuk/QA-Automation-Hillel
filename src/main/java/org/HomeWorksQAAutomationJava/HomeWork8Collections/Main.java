package org.HomeWorksQAAutomationJava.HomeWork8Collections;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import org.apache.commons.lang3.StringUtils;

//Написати метод який приймає рядок. Розбити рядок за словами прибравши всі роздільники (прогалини,
// коми, крапки). Зробити набір слів унікальним і вивести результат у консоль, привести першу літеру
// кожного слова до великої.
//
//        Наприклад, меторд прийняв "масло, масло, ковбаса, молоко".
//        Виведення в консоль:
//Масло
//Ковбаса
//Молоко
public class Main {
    public static void main(String[] args) {


        String newstr;


        System.out.println("Please enter string here and press enter:");
        Scanner scanner = new Scanner(System.in);
        newstr = scanner.nextLine();

        uniquewords(newstr);

    }

    public static void uniquewords(String str) {

        Set<String> wordsset = new TreeSet<>();
        String[] arraystr = str.split(" ");

        for (String string : arraystr) {

            // [^A-Za-zА-Яа-я0-9] Everything except letters and numbers will be deleted. Regular expression.
            wordsset.add(StringUtils.capitalize(string.replaceAll("[^A-Za-zА-Яа-я0-9]", "")));
        }

        //This for-each only for good output in console
        for (String string : wordsset) {
            System.out.println(string);
        }




    }
}


