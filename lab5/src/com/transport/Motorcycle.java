package com.transport;

public class Motorcycle extends Transport {

    @Override
    void Move() {
        System.out.println("Мотоцикл " + model + " движется по дороге со скоростью " + speed + " км/ч.");
    }

    @Override
    void FuelUp() {
        System.out.println("Заправка мотоцикла бензином.");
    }
}
