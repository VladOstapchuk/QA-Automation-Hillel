package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task3;

/*
2 ** Створити метод calcOccurance, який приймає на вхід рядковий список як параметр.
Список заповнений довільними словами 10-20 штук, які можуть повторюватись у необмеженій
кількості. Обчислити скільки разів трапляється кожне слово. Результат вивести у консоль.
Наприклад:
bird: 2
fox: 1
cat: 1
*/

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //third task
        List listThirdTask = new ArrayList();
        listThirdTask.add("bird");
        listThirdTask.add("fox");
        listThirdTask.add("fox");
        listThirdTask.add("fox");
        listThirdTask.add("bird");
        listThirdTask.add("fox");
        listThirdTask.add("cat");
        listThirdTask.add("bird");
        listThirdTask.add("cat");


        FindOcc find1 = new FindOcc();


        System.out.println("____________________________________________________");
        System.out.println("Task 3 result");
        find1.findOccurance(listThirdTask);

    }







}





