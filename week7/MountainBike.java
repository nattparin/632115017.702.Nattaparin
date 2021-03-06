package week7;

public class MountainBike extends Bicycle {
    public MountainBike(int currentSpeed){
        setSpeed(currentSpeed);
        System.out.println("Mountain Bike");
        if(checkSpeed(getSpeed())){
            setSpeed(getSpeed()-currentSpeed);
        }
    }
    public void gear(int gear){
        setSpeed(getSpeed()+(gear* getConstanceSpeed()));
        if (checkSpeed(getSpeed())) {
            setSpeed(getSpeed() - (gear * getConstanceSpeed()));
        }
    }

    public void Break() {
        setSpeed(getSpeed() - getConstanceSpeed());
    }
}