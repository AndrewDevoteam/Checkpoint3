package src.domain;

public class VehicleService {

    private final VehicleRepository vehicleRepository = new VehicleRepository();

    public void searchByAutomaker(String manufacturerName) {
        boolean result = false;

        for (int i = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getAutoMaker().getName().equalsIgnoreCase(manufacturerName)) {
                result = true;
                vehicleRepository.getVehicleList()[i].prettyPrint();
            }
        }
        if (!result) {
            System.out.println("Invalid automaker option");
        }
    }

    public void searchByModel(String modelName) {
        boolean result = false;
        for (int i = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getModel().equalsIgnoreCase(modelName)) {
                result = true;
                vehicleRepository.getVehicleList()[i].prettyPrint();
            }
        }
        if (!result) {
            System.out.println("Invalid vehicle option");
        }
    }

    public Vehicle addVehicle(String model, String color, String year, AutoMaker automaker, VehicleTypeEnum vehicleTypeEnum) {

        return switch (vehicleTypeEnum) {
            case CAR -> new Car(model, color, year, automaker, vehicleTypeEnum);
            case MOTORCYCLE -> new Motorcycle(model, color, year, automaker, vehicleTypeEnum);
            case VAN -> new Van(model, color, year, automaker, vehicleTypeEnum);
            case TRUCK -> new Truck(model, color, year, automaker, vehicleTypeEnum);
            case PICKUP -> new PickUp(model, color, year, automaker, vehicleTypeEnum);
            case OTHERS -> new Others(model, color, year, automaker, vehicleTypeEnum);
        };
    }

    public void updateVehicle(Vehicle carOld, Vehicle carNew) {
        for (int i = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getModel().equalsIgnoreCase(carOld.getModel())) {
                vehicleRepository.getVehicleList()[i].setModel(carNew.getModel());
                vehicleRepository.getVehicleList()[i].setColor(carNew.getColor());
                vehicleRepository.getVehicleList()[i].setYear(carNew.getYear());
                vehicleRepository.getVehicleList()[i].setAutoMaker(carNew.getAutoMaker());
                vehicleRepository.getVehicleList()[i].setVehicleTypeEnum(carNew.getVehicleType());
            }
        }
    }

    public void deleteVehicleByModel(String deleteVehicle) {
        boolean result = false;
        for (Vehicle car : vehicleRepository.getVehicleList()) {
            if (car.getModel().equalsIgnoreCase(deleteVehicle)) {
                result = true;
                vehicleRepository.updatedVehicleRepository(car);
                System.out.println("Vehicle was successfully deleted");
            }
        }
        if (!result) {
            System.out.println("Invalid vehicle option");
        }
    }
}