package com.transport;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Выберите тип транспорта: 1 - Автомобиль, 2 - Мотоцикл, 3 - Самолет");
        int choice = scanner.nextInt();
        scanner.nextLine();


        System.out.print("Введите модель транспортного средства: ");
        String model = scanner.nextLine();

        System.out.print("Введите скорость транспортного средства (км/ч): ");
        int speed = scanner.nextInt();

        Transport transport = null;


        switch (choice) {
            case 1:
                TransportFactory carFactory = new CarFactory();
                transport = carFactory.createTransport();
                break;
            case 2:
                TransportFactory motorcycleFactory = new MotorcycleFactory();
                transport = motorcycleFactory.createTransport();
                break;
            case 3:
                TransportFactory planeFactory = new PlaneFactory();
                transport = planeFactory.createTransport();
                break;
            default:
                System.out.println("Неверный выбор!");
                return;
        }


        if (transport != null) {
            transport.setModel(model);
            transport.setSpeed(speed);


            transport.displayInfo();
            transport.Move();
            transport.FuelUp();
        }

        scanner.close();
    }





    }