package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;

public class Runningtrack implements Pereshkoda {

    //назва типу перешкоди
    private final String name = "Бігова доріжка";

    //розмір перешкоди
    private final int size = 10;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    //перевіряємо чи здатен подалати учасник перешкду
    @Override
    public void process(Member member) {
        if ((member.getCanMove() - size) >= 0)
        {
            member.podolatyPereshkodu(this);
        }
        else {
            member.nePodolavPereshkodu(this);
        }

    }


}
