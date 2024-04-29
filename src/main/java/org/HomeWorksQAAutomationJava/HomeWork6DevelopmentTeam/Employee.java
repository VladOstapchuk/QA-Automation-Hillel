package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

public abstract class Employee {
    final String name;

    public Employee(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public String getLastName(){
        return "";
    }


    public abstract String getPosition();

    public abstract String getSeniority();

    public String getInfo(){

        return getName() +" " + getLastName() + " is a " + getSeniority() + " " + getPosition() ;

    }

}
