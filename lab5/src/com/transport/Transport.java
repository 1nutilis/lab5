package com.transport;


public abstract class Transport {

    protected String model;
    protected int speed;


    public void setModel(String model) {
        this.model = model;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }


    abstract void Move();
    abstract void FuelUp();


    public void displayInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Скорость: " + speed + " км/ч");
    }
}


