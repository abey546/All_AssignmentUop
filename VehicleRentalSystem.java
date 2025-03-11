import java.util.Scanner;

// Vehicle Interface
interface Vehicle {
    String getMake();
    String getModel();
    int getYear();
}

// CarVehicle Interface
interface CarVehicle {
    void setNumberOfDoors(int doors);
    int getNumberOfDoors();
    void setFuelType(String fuelType);
    String getFuelType();
}

// MotorVehicle Interface
interface MotorVehicle {
    void setNumberOfWheels(int wheels);
    int getNumberOfWheels();
    void setMotorcycleType(String type);
    String getMotorcycleType();
}

// TruckVehicle Interface
interface TruckVehicle {
    void setCargoCapacity(double capacity);
    double getCargoCapacity();
    void setTransmissionType(String transmission);
    String getTransmissionType();
}

// Car Class
class Car implements Vehicle, CarVehicle {
    private String make, model, fuelType;
    private int year, doors;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setNumberOfDoors(int doors) { this.doors = doors; }
    public int getNumberOfDoors() { return doors; }
    public void setFuelType(String fuelType) { this.fuelType = fuelType; }
    public String getFuelType() { return fuelType; }
}

// Motorcycle Class
class Motorcycle implements Vehicle, MotorVehicle {
    private String make, model, type;
    private int year, wheels;
    
    public Motorcycle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setNumberOfWheels(int wheels) { this.wheels = wheels; }
    public int getNumberOfWheels() { return wheels; }
    public void setMotorcycleType(String type) { this.type = type; }
    public String getMotorcycleType() { return type; }
}

// Truck Class
class Truck implements Vehicle, TruckVehicle {
    private String make, model, transmission;
    private int year;
    private double cargoCapacity;
    
    public Truck(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public int getYear() { return year; }
    public void setCargoCapacity(double capacity) { this.cargoCapacity = capacity; }
    public double getCargoCapacity() { return cargoCapacity; }
    public void setTransmissionType(String transmission) { this.transmission = transmission; }
    public String getTransmissionType() { return transmission; }
}

// Main Program
public class VehicleRentalSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter vehicle type (Car/Motorcycle/Truck): ");
        String type = scanner.nextLine();
        
        System.out.println("Enter Make: ");
        String make = scanner.nextLine();
        
        System.out.println("Enter Model: ");
        String model = scanner.nextLine();
        
        System.out.println("Enter Year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        if (type.equalsIgnoreCase("Car")) {
            Car car = new Car(make, model, year);
            System.out.println("Enter Number of Doors: ");
            car.setNumberOfDoors(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter Fuel Type (Petrol/Diesel/Electric): ");
            car.setFuelType(scanner.nextLine());
            System.out.println("Car Details: " + car.getMake() + " " + car.getModel() + ", " + car.getYear() + " - " + car.getNumberOfDoors() + " doors, " + car.getFuelType());
        } else if (type.equalsIgnoreCase("Motorcycle")) {
            Motorcycle moto = new Motorcycle(make, model, year);
            System.out.println("Enter Number of Wheels: ");
            moto.setNumberOfWheels(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Enter Motorcycle Type (Sport/Cruiser/Off-road): ");
            moto.setMotorcycleType(scanner.nextLine());
            System.out.println("Motorcycle Details: " + moto.getMake() + " " + moto.getModel() + ", " + moto.getYear() + " - " + moto.getNumberOfWheels() + " wheels, " + moto.getMotorcycleType());
        } else if (type.equalsIgnoreCase("Truck")) {
            Truck truck = new Truck(make, model, year);
            System.out.println("Enter Cargo Capacity (in tons): ");
            truck.setCargoCapacity(scanner.nextDouble());
            scanner.nextLine();
            System.out.println("Enter Transmission Type (Manual/Automatic): ");
            truck.setTransmissionType(scanner.nextLine());
            System.out.println("Truck Details: " + truck.getMake() + " " + truck.getModel() + ", " + truck.getYear() + " - " + truck.getCargoCapacity() + " tons, " + truck.getTransmissionType());
        } else {
            System.out.println("Invalid vehicle type!");
        }

        scanner.close();
    }
}