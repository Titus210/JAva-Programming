package Bicycle;
class MountainBike extends Bicycle {

    public int seatHeight;

    public MountainBike(int startHeight, int startSpeed, int startGear) {
        super(startGear, startSpeed); // used on top of child constructor
        this.seatHeight = startHeight;
    }

    public void setHeight(int newValue){

    }
}
