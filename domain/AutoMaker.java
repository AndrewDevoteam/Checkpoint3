package domain;

public class AutoMaker {
    private String name;
    private Vehicle[] vehicles;

    public AutoMaker(String name) {
        this.name = name;
    }

    public AutoMaker(String name, Vehicle[] vehicles) {
        this.name = name;
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle[] getVehicles() {
        return vehicles;
    }

    public void setVehicles(Vehicle[] vehicles) {
        this.vehicles = vehicles;
    }
}
