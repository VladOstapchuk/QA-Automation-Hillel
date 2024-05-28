package org.HomeWorksQAAutomationJava.HomeWork9_Collections.Task2;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //second task
        List listSecondTask = new ArrayList();
        listSecondTask.add("apple");
        listSecondTask.add("mango");
        listSecondTask.add("car");
        listSecondTask.add("pet");
        listSecondTask.add("mango");
        listSecondTask.add("pet");
        listSecondTask.add("car");
        listSecondTask.add("car");
        listSecondTask.add("car");


        Calc calc1 = new Calc();
        System.out.println("____________________________________________________");
        System.out.println("Task 2 result");
        calc1.calcOccurance(listSecondTask);


    }


}






