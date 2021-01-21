package week7;

public class MainBicycle  {
    public static void main(String[] args) {
        Bike bike = new Bike(10);
        bike.SpeedUp();
        bike.Break();
        bike.SpeedUp();
        bike.DisplaySpeed();
        MountainBike bike2 = new MountainBike(10);
        bike2.gear(2);
        bike2.Break();
        bike2.DisplaySpeed();
        bike2.gear(3);
        bike2.DisplaySpeed();
        bike2.gear(14);
        bike2.DisplaySpeed();
    }
}
