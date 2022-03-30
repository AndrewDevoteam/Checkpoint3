package domain;

public class VehicleRepository {

    private Vehicle[] vehicleList;

    public  Vehicle[] initVehicleArray(){

        AutoMaker gm = new AutoMaker("GM");
        Vehicle suburban = new Vehicle("Suburban", "Red", "1995", gm);
        Vehicle malibu = new Vehicle("Malibu", "Yellow", "2003", gm);
        Vehicle silverado = new Vehicle("Silverado", "Blue", "2007", gm);

        AutoMaker hyundai = new AutoMaker("Hyundai");
        Vehicle azera = new Vehicle("Azera", "Red", "2014", hyundai);
        Vehicle sonata = new Vehicle("Sonata", "Yellow", "2015", hyundai);
        Vehicle veloster = new Vehicle("Veloster", "Blue", "2009", hyundai);

        AutoMaker volksWagen = new AutoMaker("VolksWagen");
        Vehicle golf = new Vehicle("Golf", "Red", "1994", volksWagen);
        Vehicle jetta = new Vehicle("Jetta", "Yellow", "2017", volksWagen);
        Vehicle polo = new Vehicle("Polo", "Blue", "2000", volksWagen);

        AutoMaker audi = new AutoMaker("Audi");
        Vehicle a4 = new Vehicle("A4", "Red", "2001", audi);
        Vehicle q7 = new Vehicle("Q7", "Yellow", "2002", audi);
        Vehicle r8 = new Vehicle("R8", "Blue", "1999", audi);

        AutoMaker mercedes = new AutoMaker("Mercedes");
        Vehicle c180 = new Vehicle("C180", "Red", "2017", mercedes);
        Vehicle c200 = new Vehicle("C200", "Yellow", "2018", mercedes);
        Vehicle gLA200 = new Vehicle("GLA200", "Blue", "2019", mercedes);

        AutoMaker peugeot = new AutoMaker("Peugeot");
        Vehicle p206 = new Vehicle("206", "Red", "2006", peugeot);
        Vehicle p208 = new Vehicle("208", "Yellow", "2008", peugeot);
        Vehicle p2008 = new Vehicle("2008", "Blue", "2007", peugeot);

        Vehicle[] vehicleList = {
                suburban, malibu, silverado,
                azera, sonata, veloster,
                golf, polo, jetta,
                a4, q7, r8,
                c180, c200, gLA200,
                p206, p208, p2008
        };
        return vehicleList;
    }

    public VehicleRepository() {
        vehicleList = initVehicleArray();
    }


    public void addVehicleRepository(Vehicle vehicle) {
        int i;
        Vehicle newVehicleList[] = new Vehicle[vehicleList.length + 1];
        for (i = 0; i < vehicleList.length; i++)
            newVehicleList[i] = vehicleList[i];
        newVehicleList[vehicleList.length] = vehicle;
        vehicleList = newVehicleList;
    }

    public void updatedVehicleRepository(Vehicle vehicle) {
        Vehicle[] newVehicleList = new Vehicle[vehicleList.length - 1];
        for (int i = 0, k = 0; i < vehicleList.length; i++) {
            if (vehicleList[i].getModel().equalsIgnoreCase(vehicle.getModel())) {
                continue;
            }
            newVehicleList[k++] = vehicleList[i];
        }
        vehicleList = newVehicleList;
    }

    public Vehicle[] getVehicleList() {
        return vehicleList;
    }

    public void setVehicleList(Vehicle[] vehicleList) {
        this.vehicleList = vehicleList;
    }

}
