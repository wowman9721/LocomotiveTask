package com.epam.secondTask;

public class Locomotive extends Train {
    private double velocity;
    private double acceleration;
    private int weight;

    public Locomotive() {
    }

    public Locomotive(int quantityOfwagons, double velocity, double acceleration, int weight) {
        super(quantityOfwagons);
        this.velocity = velocity;
        this.acceleration = acceleration;
        this.weight = weight;
    }

    public double getVelocity() {
        return velocity;
    }

    public void setVelocity(double velocity) {
        this.velocity = velocity;
    }

    public double getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(double acceleration) {
        this.acceleration = acceleration;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
