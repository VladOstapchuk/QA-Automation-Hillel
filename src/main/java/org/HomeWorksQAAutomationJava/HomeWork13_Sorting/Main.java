package org.HomeWorksQAAutomationJava.HomeWork13_Sorting;

public class Main {

    public static void main(String[] args) {

        Student student1 = new Student("Alice", 30, 3.2);
        Student student2 = new Student("Frank", 40, 4.8);
        Student student3 = new Student("Mary", 20, 4.3);
        Student student4 = new Student("Tony", 18, 3.2);
        Student student5 = new Student("Aaron", 30, 3.2);
        Student student6 = new Student("Mary", 21, 4.3);

        Group group1 = new Group("Group1");
        group1.addStudent(student1, student2, student3, student4, student5, student6);


        System.out.println(group1.getStudents());


    }
}
