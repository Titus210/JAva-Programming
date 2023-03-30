package Projects.Car;

public class Car {
    String type;
    int model;
    int yearOfManufacture;
    String color;
    double price;
    int noOfDoors;
    double milage;
    String owner;
    String fuelType;

    public Car(){
    System.out.println("Car Object Created");
    }
    double getPrice() {
        double newPrice = price - (milage * 100);
        return newPrice;
    }

    String getOwner() {
        return owner;
    }

}
