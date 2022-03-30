package main;

import domain.AutoMaker;
import domain.Vehicle;
import domain.VehicleRepository;
import domain.VehicleService;

import java.util.Scanner;

public class ApplicationClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VehicleService vehicleService = new VehicleService();
        VehicleRepository vehicleRepository = new VehicleRepository();

        int continueOrNot = 1;
        while (continueOrNot != 0) {
            System.out.println("----------------------");
            System.out.println("Please select an option");
            System.out.println("1. - Search by Automaker");
            System.out.println("2. - Search by Car Model");
            System.out.println("3. - Add a Vehicle");
            System.out.println("4. - Update a Vehicle");
            System.out.println("5. - Delete a Vehicle");
            int selectedOption = scanner.nextInt();

            switch (selectedOption) {
                case 1 -> {
                    System.out.println("Please type in a manufacturer name");
                    String manufacturerName = scanner.next();
                    vehicleService.searchByAutomaker(manufacturerName);

                }
                case 2 -> {
                    System.out.println("Please type in a vehicle model");
                    String modelName = scanner.next();
                    vehicleService.searchByModel(modelName);
                }
                case 3 -> {
                    System.out.println("Please type in the name of the vehicle");
                    String name = scanner.next();
                    System.out.println("Please type in the year of production of the vehicle");
                    String year = scanner.next();
                    System.out.println("Please type in the color of the vehicle");
                    String color = scanner.next();
                    System.out.println("Please type in the automaker of the vehicle");
                    String autoMaker = scanner.next();
                    AutoMaker automaker = new AutoMaker(autoMaker);
                    Vehicle vehicle = new Vehicle(name, color, year, automaker);
                    vehicleService.addVehicle(vehicle);
                }
                case 4 -> {
                    System.out.println("Please type in the name of the vehicle to update");
                    String selectedVehicle = scanner.next();
                    boolean result = false;
                    for (Vehicle vehicle : vehicleRepository.getVehicleList()) {
                        if (vehicle.getModel().equalsIgnoreCase(selectedVehicle)) {
                            result = true;
                            System.out.println("Please type in the updated vehicle name ");
                            String updatedName = scanner.next();
                            System.out.println("Please type in the updated year of Production ");
                            String updatedYear = scanner.next();
                            System.out.println("Please type in the updated color ");
                            String updatedColor = scanner.next();
                            System.out.println("Please type in the updated name of the automaker ");
                            String updatedManufacturer = scanner.next();
                            AutoMaker automaker = new AutoMaker(updatedManufacturer);
                            Vehicle newVehicle = new Vehicle(updatedName, updatedColor, updatedYear, automaker);
                            vehicleService.updateVehicle(vehicle, newVehicle);
                        }
                    }
                    if (!result){
                        System.out.println("Invalid option");
                    }
                }
                case 5 -> {
                    System.out.println("Please type in the name of the vehicle you want to delete");
                    String vehicleName = scanner.next();
                    vehicleService.deleteVehicleByModel(vehicleName);

                }
                default -> System.out.println("Invalid input");
            }
            System.out.println("Do you wish to continue?");
            System.out.println("0. No");
            System.out.println("1. Yes");
            continueOrNot = scanner.nextInt();
        }
        System.out.println("Program Terminated");
    }
}
