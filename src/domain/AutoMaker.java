package src.domain;

public class AutoMaker {
    private String name;
    private Vehicle[] cars;

    public AutoMaker(String name) {
        this.name = name;
    }

    public AutoMaker(String name, Vehicle[] cars) {
        this.name = name;
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return cars;
    }

    public void setVehicles(Vehicle[] cars) {
        this.cars = cars;
    }
}
