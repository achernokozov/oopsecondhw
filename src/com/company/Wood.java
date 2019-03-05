package com.company;

public abstract class Wood {
    private static String name;

    final static void sayHello(){ //final method
        System.out.println("Let's create two boys from wood!");
    }
    abstract void countFirstAppearance();

    public Wood(String name){
        this.name = name;
    }

    public static String getName() {
        return name;
    }




}
