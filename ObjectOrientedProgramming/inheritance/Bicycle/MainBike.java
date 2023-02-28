package Bicycle;
public class MainBike {
    public static void main(String[] args){
        MountainBike mountainBike = new MountainBike(20,10,1);
        System.out.println("Gear is: "+ mountainBike.gear);
        System.out.println("Seat Height is: "+ mountainBike.seatHeight);
        System.out.println("Bike Speed is: "+ mountainBike.speed);

        // apply brake
        mountainBike.applyBrake(1);
        System.out.println("Bile speed after applying brake: "+ mountainBike.speed);
    }
    
}
