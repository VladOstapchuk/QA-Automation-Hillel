package org.HomeWorksQAAutomationJava.HomeWork6DevelopmentTeam;

public class Main {

    public static void main(String[] args) {
        JavaDeveloper javaDev = new JavaDeveloper("Tom");
        AngularDeveloper angularDev = new AngularDeveloper("Bill");
        AutomationEngineer autoTester = new AutomationEngineer("Misha", "Aksani");
        ManualTestEngineer manualTester = new ManualTestEngineer("John", "Smith");
        Manager manager = new Manager("William", "Underwood");

        manager.setTeamMembers(javaDev, angularDev, autoTester, manualTester);

        printInfo(javaDev);
        printInfo(angularDev);
        printInfo(autoTester);
        printInfo(manualTester);
        printInfo(manager);
    }

   private static void printInfo(Employee employee) {

       System.out.println(employee.getInfo());
  }
}
