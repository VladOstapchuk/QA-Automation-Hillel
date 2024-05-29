package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;

public class Main {

    public static void main(String[] args) {
        Member man1 = new Man();
        Member cat1 = new Cat();
        Member robot1 = new Robot();

        Pereshkoda runningtrack = new Runningtrack();
        Pereshkoda wall = new Wall();

        man1.podolatyPereshkodu(runningtrack);
        cat1.podolatyPereshkodu(wall);
        robot1.podolatyPereshkodu(runningtrack);
        robot1.podolatyPereshkodu(wall);
        System.out.println("----------------------");

        // Створення масивів учасників та перешкод
        Member[] members = {new Man(), new Cat(), new Robot(), new Cat(), new Robot()};
        Pereshkoda[] pereshkody = {new Runningtrack(), new Wall()};

        // Проходження всіма учасниками всіх перешкод
        for (Member member : members) {
            for (Pereshkoda pereshkoda : pereshkody) {
                pereshkoda.process(member);
                System.out.println("----------------------");
            }
        }

    }
}
