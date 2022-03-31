package src.domain;

public class Motorcycle extends Vehicle{
    public Motorcycle(String model, String color, String year, AutoMaker autoMaker, VehicleTypeEnum vehicleTypeEnum) {
        super(model, color, year, autoMaker, vehicleTypeEnum);
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.MOTORCYCLE;
    }
}
