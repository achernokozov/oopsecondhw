package com.company;

public abstract class Buratino extends Wood {
    private int year;
    private static String name;

    public Buratino(String name) {
        super(name);
    }

    @Override
    void countFirstAppearance() {
    }

    static void countFirstAppearance(int year){
        System.out.println("Hello! My name is " + getName() + " and I'm "+ (2019-year) + " years old." );
    }

    public static void setName(String name) {
        Buratino.name = name;
    }

    public static String getName() {
        return name;
    }
}
