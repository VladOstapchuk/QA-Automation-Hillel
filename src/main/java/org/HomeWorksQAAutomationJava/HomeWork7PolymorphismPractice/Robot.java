package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;

public class Robot extends Member{

    private final String type;
    private final String name;

    public Robot(String type, String name) {
        this.type = type;
        this.name = name;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    void behavior() {
        System.out.println("Переступив");
    }
}
