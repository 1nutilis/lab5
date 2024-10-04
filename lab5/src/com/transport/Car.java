package com.transport;

public class Car extends Transport {

    @Override
    void Move() {
        System.out.println("Автомобиль " + model + " движется по дороге со скоростью " + speed + " км/ч.");
    }

    @Override
     void FuelUp() {
        System.out.println("Заправка автомобиля бензином.");
    }
}
