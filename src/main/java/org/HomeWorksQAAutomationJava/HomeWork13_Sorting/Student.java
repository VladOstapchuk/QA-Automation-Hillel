package org.HomeWorksQAAutomationJava.HomeWork13_Sorting;

public class Student {

    private String name;
    private int age;
    private double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    //гетери, щоб можна було порівнювати в компараторі
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getGrade() {
        return grade;
    }

    //оверайд вивода за вимогою завдання
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getName()).append(" (Age: ").append(getAge()).append(", Grade: ").append(getGrade()).append(')');
        return sb.toString();
    }
}
