package org.HomeWorksQAAutomationJava.HomeWork5Inheritance;

public class Cat extends Animal{
    private String color;


    //standart constructor
    public Cat(boolean vegetarian, String eats, int noOfLegs, String color) {
        super(vegetarian, eats, noOfLegs);
        this.color = color;
    }

    //constructor with default for color
    public Cat(boolean vegetarian, String eats, int noOfLegs) {
        super(vegetarian, eats, noOfLegs);
        this.color = "red";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }




}
