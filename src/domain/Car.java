package src.domain;

public class Car extends Vehicle{
    public Car(String model, String color, String year, AutoMaker autoMaker, VehicleTypeEnum vehicleTypeEnum) {
        super(model, color, year, autoMaker, vehicleTypeEnum);
    }

    public Car(String model, String color, String year, AutoMaker autoMaker) {
        super(model, color, year, autoMaker);
    }

    @Override
    public VehicleTypeEnum getVehicleType() {
        return VehicleTypeEnum.CAR;
    }
}
