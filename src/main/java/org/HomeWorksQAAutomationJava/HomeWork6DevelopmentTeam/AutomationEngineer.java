package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

public class AutomationEngineer extends Employee{

final String lastName;

    public AutomationEngineer(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Automation Engineer";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }
}
