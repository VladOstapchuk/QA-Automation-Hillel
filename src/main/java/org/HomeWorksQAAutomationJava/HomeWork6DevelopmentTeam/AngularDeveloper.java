package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

public class AngularDeveloper extends Employee{


    public AngularDeveloper(String name) {
        super(name);
    }

    @Override
    public String getPosition() {
        return "Angular Developer";
    }

    @Override
    public String getSeniority() {
        return "Middle";
    }
}
