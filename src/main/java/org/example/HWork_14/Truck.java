package org.example.HWork_14;

public final class Truck extends Car {
    private int cargoCapacity;
    private String cargoType;

    public Truck(String model, double engineVolume, EngineType engineType, int horsepower, double weight, int seats, CarType carType, int maxSpeed, int cargoCapacity, String cargoType) {
        super(model, engineVolume, engineType, horsepower, weight, seats, carType, maxSpeed);
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
    }

    public int getCargoCapacity(){
        return cargoCapacity;
    }
    public String getCargoType(){
        return cargoType;
    }

    public double calculateCargoCost(double cargoWeight, double pricePerKilogram) {
        return cargoWeight * pricePerKilogram;
    }


}
