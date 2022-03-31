package src.domain;

public abstract class Vehicle implements GetVehicleType{

    private String model;
    private String color;
    private String year;
    private AutoMaker autoMaker;
    protected VehicleTypeEnum vehicleTypeEnum;


    public Vehicle(String model, String color, String year, AutoMaker autoMaker) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.autoMaker = autoMaker;
    }

    public Vehicle(String model, String color, String year, AutoMaker autoMaker, VehicleTypeEnum vehicleTypeEnum) {
        this.model = model;
        this.color = color;
        this.year = year;
        this.autoMaker = autoMaker;
        this.vehicleTypeEnum = vehicleTypeEnum;
    }

    public void prettyPrint(){
        System.out.println("Model " + model);
        System.out.println("Color " + color);
        System.out.println("Year " + year);
        System.out.println("AutoMaker " + autoMaker.getName());
        System.out.println("Vehicle Type " + getVehicleType());
        System.out.println("------------------");
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public AutoMaker getAutoMaker() {
        return autoMaker;
    }

    public void setAutoMaker(AutoMaker autoMaker) {
        this.autoMaker = autoMaker;
    }

    public VehicleTypeEnum getVehicleTypeEnum() {
        return vehicleTypeEnum;
    }

    public void setVehicleTypeEnum(VehicleTypeEnum vehicleTypeEnum) {
        this.vehicleTypeEnum = vehicleTypeEnum;
    }
}
