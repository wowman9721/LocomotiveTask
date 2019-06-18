package com.epam.secondTask;

import java.util.Scanner;

public class TrainService {
    final static int DELIMETER_FOR_TONS = 1000;
    final static double DELIMETER_FOR_VELOCITY = 0.27;

    public void calculateSpecificationsOfTrain() {
        double locomotivePower;
        int quantityOfFreightWagons;
        int quantityOfPostWagons;
        int quantityOfPassengerWagons;
        Locomotive specifications = new Locomotive();
        Scanner inputSpecifications = new Scanner(System.in);
        System.out.println("Enter weight (kg)");
        int enteredWeight = inputSpecifications.nextInt();
        System.out.println("Enter acceleration ");
        double enteredAcceleration = inputSpecifications.nextDouble();
        System.out.println("Enter velocity (km/h)");
        double enteredVelocity = inputSpecifications.nextDouble();
        specifications.setWeight(enteredWeight);
        specifications.setAcceleration(enteredAcceleration);
        specifications.setVelocity(enteredVelocity);
        locomotivePower = (specifications.getWeight() / DELIMETER_FOR_TONS) * specifications.getAcceleration() * (specifications.getVelocity() / DELIMETER_FOR_VELOCITY);
        System.out.println("Locomotive power: " + (int) locomotivePower);
        quantityOfFreightWagons = (int) locomotivePower / FreightTrain.REQUIRED_POWER_FOR_DELIVER_FREIGHT;
        System.out.println("Avaliable quantity of Freight wagons: " + quantityOfFreightWagons);
        quantityOfPostWagons = (int) locomotivePower / PostTrain.REQUIRED_POWER_FOR_DELIVER_LETTERS;
        System.out.println("Avaliable quantity of Post wagons: " + quantityOfPostWagons);
        quantityOfPassengerWagons = (int) locomotivePower / PassengerTrain.REQUIRED_POWER_FOR_DELIVER_PASSENGERS;
        System.out.println("Avaliable quantity of Passenger wagons: " + quantityOfPassengerWagons);
    }
}

