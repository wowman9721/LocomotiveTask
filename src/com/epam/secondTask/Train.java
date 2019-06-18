package com.epam.secondTask;

public abstract class Train {
    private int quantityOfwagons;

    public Train() {
    }

    public Train(int quantityOfwagons) {
        this.quantityOfwagons = quantityOfwagons;
    }

    public int getQuantityOfwagons() {
        return quantityOfwagons;
    }

    public void setQuantityOfwagons(int quantityOfwagons) {
        this.quantityOfwagons = quantityOfwagons;
    }
}
