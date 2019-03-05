package com.company;

public class Theatre implements Sing {
    private String song;

    public Theatre (String song){
        this.song=song;
    }
    public void sing(){
        System.out.println("Let's sing together:\n".concat(song));
    }
}
