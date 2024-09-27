package org.example.arge;

public class ElectricCar extends CarSkeleton{
    private double avgKmPerLitre;
    private int batterySize;

    public ElectricCar(String name, String description, double avgKmPerLitre, int batterySize) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    @Override
    public void startEngine(){
    }
    @Override
    public void drive(){
        runEngine();
    }
}
