package week7;

public class MountainBike extends Bicycle {
    private int gear;

    public MountainBike(int speed){
        super(speed);
        }
    public void gear(int number){
        gear=number;
        System.out.println("Change gear"+number);
    }
    public void Speedup(){
        if(speed>99)
            speed=99;
        else
            speed+=5*gear;
        System.out.println("Speed UP");
    }
    public void Break1(){
        speed-=5;
        
        System.out.println("Break");
    }
}
