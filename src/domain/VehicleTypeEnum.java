package src.domain;

public enum VehicleTypeEnum {
    CAR(1),
    MOTORCYCLE(2),
    VAN(3),
    TRUCK(4),
    PICKUP(5),
    OTHERS(6);

    private int dbValue;

    VehicleTypeEnum(int dbValue) {
        this.dbValue = dbValue;
    }

}

