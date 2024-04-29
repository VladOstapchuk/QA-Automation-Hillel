package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

import java.util.Arrays;

public class Manager extends Employee {
    final String lastName;
    private Employee[] team;

    public Manager(String name, String lastName) {
        super(name);
        this.lastName = lastName;
    }

    public void setTeamMembers(Employee... team) {
        this.team = team;
    }


    @Override
    public String getLastName() {
        return lastName;
    }

    @Override
    public String getPosition() {
        return "Manager";
    }

    @Override
    public String getSeniority() {
        return "Senior";
    }


    //use length of array like team members quantity
    @Override
    public String getInfo() {
        return super.getInfo() + " and has a team of " + team.length + " members: " + toString(team);

    }


    //override Arrays.toString for array of Employee with getName method
    public String toString(Employee[] team) {
        if (team == null)
            return "null";

        int iMax = team.length - 1;
        if (iMax == -1)
            return "[]";

        StringBuilder b = new StringBuilder();
        b.append('[');
        for (int i = 0; ; i++) {
            b.append(team[i].getName());
            if (i == iMax)
                return b.append(']').toString();
            b.append(", ");
        }


    }
}





