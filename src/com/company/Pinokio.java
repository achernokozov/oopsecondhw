package com.company;

public class Pinokio extends Wood {
    private int year;


    public Pinokio(String name, int year){
        super(name);
        this.year=year;
    }

    @Override
    void countFirstAppearance() {
    }

    void countFirstAppearance(int year){
        System.out.println("First appearance of " + getName() + " in literature was "+ (2019-year) + " years ago." );
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getYear() {
        return year;
    }
}
