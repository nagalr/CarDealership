package org.example;

public class Vehicle {

    private double price;
    private int productionYear;

    public Vehicle(double price, int productionYear) {
        this.price = price;
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }
}

