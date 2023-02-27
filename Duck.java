package com.design.duck;

public abstract class Duck {
    protected String region;
     Flyable flying;

    public Duck(){
        this.region = "null";
    }

    public void swim(){
        System.out.println("I am a great swimmer ");
    }
    public abstract void display();

    public void performFly(){
        flying.fly();
    }
}
