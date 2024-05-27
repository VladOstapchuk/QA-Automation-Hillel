package org.HomeWorksQAAutomationJava.HomeWork9Collections.Exersise_1and2_OOP;

/*
 1 Створити метод countOccurance, що приймає на вхід рядковий список як параметр
 і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись
  у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
*/


public class Main {

    public static void main(String[] args) {

        Count count1 = new Count();
        Count count2 = new Count();

        // first = 1; second = 4; third = 5; ten = 3; twenty = 1
        count1.addWordTolist("first");
        count1.addWordTolist("second");
        count1.addWordTolist("third");
        count1.addWordTolist("ten");
        count1.addWordTolist("twenty");
        count1.addWordTolist("second");
        count1.addWordTolist("second");
        count1.addWordTolist("second");
        count1.addWordTolist("ten");
        count1.addWordTolist("ten");
        count1.addWordTolist("third");
        count1.addWordTolist("third");
        count1.addWordTolist("third");
        count1.addWordTolist("third");


        // firs = 1; second = 4; third = 1; ten = 1; twenty = 1
        count2.addWordTolist("firs");
        count2.addWordTolist("second");
        count2.addWordTolist("third");
        count2.addWordTolist("ten");
        count2.addWordTolist("twenty");
        count2.addWordTolist("second");
        count2.addWordTolist("second");
        count2.addWordTolist("second");

        //перевіряю як додались слова у ліст
//        for (String string : count1.getWordlist()) {
//            System.out.println(string);
//        }

        System.out.println("____________________________________________________");
        System.out.println("Example 1 result");
        System.out.println("Count is: " + count1.countOccurance("third"));

        System.out.println("Count is: " + count2.countOccurance("second"));

        System.out.println("____________________________________________________");
        System.out.println("Example 2 result");
        count1.calcOccurance();

    }







}





