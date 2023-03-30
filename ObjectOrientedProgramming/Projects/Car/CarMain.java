package Car;

public class CarMain {
    public static void main(String[] args) {
        Car car1 = new Car();

        // declare object properties of class
        car1.color = "Blue";
        car1.type = "Mercedes";
        car1.model = 2016;
        car1.yearOfManufacture = 2015;
        car1.price = 100000;
        car1.noOfDoors = 4;
        car1.milage = 1233; // in kms
        car1.owner = "Titus";
        car1.fuelType = "Petrol";

        double carPrice = car1.getPrice();
        String carOwner = car1.getOwner();

        System.out.println("Car Price: " + carPrice);
        System.out.println("Car Owner: " + carOwner); 
    }
}
