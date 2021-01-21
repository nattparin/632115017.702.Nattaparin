package week7;

public class MainBicycle {
    public static void main(String[] args) {
        Bicycle bike = new Bicycle(10);
        bike.SpeedUp();
        bike.chack();
        bike.Break();
        bike.chack();

        System.out.println();

        MountainBike Mbike = new MountainBike(10);
        Mbike.gear(3);
        Mbike.Speedup();
        Mbike.chack();
        Mbike.Break1();
        Mbike.chack();
    }
}
