package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task1;

/*
 1 Створити метод countOccurance, що приймає на вхід рядковий список як параметр
 і довільний рядок. Список заповнений довільними словами 10-20 штук, які можуть повторюватись
  у необмеженій кількості. Порахувати скільки разів зустрічається переданий рядок як другий аргумент.
*/


import org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task3.FindOcc;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //first task
        List listFirstTask = new ArrayList();

        //заповнюю List
        listFirstTask.add("apple");
        listFirstTask.add("mango");
        listFirstTask.add("car");
        listFirstTask.add("pet");
        listFirstTask.add("mango");
        listFirstTask.add("pet");
        listFirstTask.add("car");
        listFirstTask.add("car");
        listFirstTask.add("car");


        Count count1 = new Count();

        //Вивожу результат
        System.out.println("____________________________________________________");
        System.out.println("Task 1 result");
        System.out.println("Count is: " + count1.countOccurance(listFirstTask, "car"));



    }







}





