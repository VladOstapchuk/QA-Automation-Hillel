package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;

public class Wall implements Pereshkoda {

    //назва типу перешкоди
    private final int size = 2;

    //розмір перешкоди
    private final String name = "Стіна";

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    //перевіряємо чи здатен подалати учасник перешкду
    @Override
    public void process(Member member) {
        if ((member.getCanMove() - size) >= 0) {
            member.podolatyPereshkodu(this);
        } else {
            member.nePodolavPereshkodu(this);
        }


    }
}

