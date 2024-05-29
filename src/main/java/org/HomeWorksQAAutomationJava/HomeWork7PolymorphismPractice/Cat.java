package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;

public class Cat extends Member{

    //на скільки може рухатись учасник
    private final int canMove = 3;

    public int getCanMove(){
        return this.canMove;
    }

    //метод що дозволяє ПРОБІГАТИ будь-яку перешкоду
    @Override
    public void bigaty(Pereshkoda pereshkoda) {
        System.out.println("Кіт пробіг " + pereshkoda.getName() + " на дистанції " + pereshkoda.getSize());
    }

    //метод що дозволяє ПЕРЕСТРИБНУТИ будь-яку перешкоду
    @Override
    public void strybaty(Pereshkoda pereshkoda) {
        System.out.println("Кіт перестрибнув " + pereshkoda.getName() + " на дистанції " + pereshkoda.getSize());
    }


    //метод визначає яка саме перешкода і як на неї реагувати
    @Override
    public void podolatyPereshkodu(Pereshkoda pereshkoda) {
        if (pereshkoda instanceof Runningtrack) {
            bigaty(pereshkoda);
        } else if (pereshkoda instanceof Wall) {
            strybaty(pereshkoda);
        } else {
            System.out.println("Невідома перешкода");
        }
    }


    //метод визначає, що робити, якщо перешкоду неможливо подалати
    @Override
    public void nePodolavPereshkodu(Pereshkoda pereshkoda) {

        System.out.println("Кіт не пройшов " + pereshkoda.getName() + " на дистанції " + (pereshkoda.getSize() - canMove) + ". Пройдено " + canMove);
    }
}



