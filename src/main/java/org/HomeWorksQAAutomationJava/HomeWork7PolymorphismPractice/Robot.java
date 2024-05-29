package org.HomeWorksQAAutomationJava.HomeWork7PolymorphismPractice;


//на скільки може рухатись учасник
public class Robot extends Member{

    private final int canMove = 10;

    public int getCanMove(){
        return this.canMove;
    }


    //метод що дозволяє ПРОБІГАТИ будь-яку перешкоду
    @Override
    public void bigaty(Pereshkoda pereshkoda) {
        System.out.println("Робот пробіг " + pereshkoda.getName() + " на дистанції " + + pereshkoda.getSize());
    }


    //метод що дозволяє ПЕРЕСТРИБНУТИ будь-яку перешкоду
    @Override
    public void strybaty(Pereshkoda pereshkoda) {
        System.out.println("Робот перестрибнув " + pereshkoda.getName() + " на дистанції " + pereshkoda.getSize());
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

        System.out.println("Робот не пройшов " + pereshkoda.getName() + " на дистанції " + (pereshkoda.getSize() - canMove) + ". Пройдено " + canMove );
    }
}


