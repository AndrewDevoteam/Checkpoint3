package domain;

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

    public void addVehicle(Vehicle vehicle) {
        vehicleRepository.addVehicleRepository(vehicle);
    }

    public void updateVehicle(Vehicle vehicleOld, Vehicle vehicleNew) {
        for (int i = 0; i < vehicleRepository.getVehicleList().length; i++) {
            if (vehicleRepository.getVehicleList()[i].getModel().equalsIgnoreCase(vehicleOld.getModel())) {
                vehicleRepository.getVehicleList()[i].setModel(vehicleNew.getModel());
                vehicleRepository.getVehicleList()[i].setColor(vehicleNew.getColor());
                vehicleRepository.getVehicleList()[i].setYear(vehicleNew.getYear());
                vehicleRepository.getVehicleList()[i].setAutoMaker(vehicleNew.getAutoMaker());
            }
        }

    }

    public void deleteVehicleByModel(String deleteVehicle) {
        boolean result = false;
        for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
            if (vehicle.getModel().equalsIgnoreCase(deleteVehicle)) {
                result = true;
                vehicleRepository.updatedVehicleRepository(vehicle);
                System.out.println("Vehicle was successfully deleted");
            }
        }
        if (!result) {
            System.out.println("Invalid vehicle option");
        }
    }
}
