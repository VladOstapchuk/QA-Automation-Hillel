package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

public class JavaDeveloper extends Employee{

    public JavaDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Java Developer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
