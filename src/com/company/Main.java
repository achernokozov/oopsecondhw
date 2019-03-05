package com.company;

public class Main {

    public static void main(String[] args) {

        Wood.sayHello(); //final method

        Pinokio pino = new Pinokio("Pinokio",1883);
        System.out.println("My name is " + pino.getName()+ ".");
        pino.countFirstAppearance(pino.getYear());


        Buratino.setName("Buratino");
        Buratino.countFirstAppearance(1936);

        Theatre the = new Theatre("Кто доброй сказкой входит в дом?\n" +
                "Кто с детства каждому знаком?\n" +
                "Кто не ученый, не поэт,\n" +
                "А покорил весь белый свет,\n" +
                "Кого повсюду узнают,\n" +
                "Скажите, как его зовут?\n" +
                "\n" +
                "Бу! Ра! Ти! Но!\n" +
                "Буратино!");
        the.sing(); //Theatre implements Sing

    }
}
