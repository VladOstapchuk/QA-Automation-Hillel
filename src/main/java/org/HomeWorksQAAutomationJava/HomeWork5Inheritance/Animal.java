package org.HomeWorksQAAutomationJava.HomeWork5Inheritance;

public class Animal {

    private boolean vegetarian;
    private String eats;
    private int noOfLegs;

    public Animal() {
    }

    public boolean getVegetarian() {
        return vegetarian;
    }


    public Animal(boolean vegetarian, String eats, int noOfLegs) {
        this.vegetarian = vegetarian;
        this.eats = eats;
        this.noOfLegs = noOfLegs;
    }


    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getEats() {
        return eats;
    }

    public void setEats(String eats) {
        this.eats = eats;
    }

    public int getNoOfLegs() {
        return noOfLegs;
    }

    public void setNoOfLegs(int noOfLegs) {
        this.noOfLegs = noOfLegs;
    }
}
