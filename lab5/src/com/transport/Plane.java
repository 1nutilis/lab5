package com.transport;

public class Plane extends Transport {

    @Override
    void Move() {
        System.out.println("Самолет " + model + " летит в небе со скоростью " + speed + " км/ч.");
    }


    @Override
    void FuelUp() {
        System.out.println("Заправка самолета авиационным топливом.");
    }

}


