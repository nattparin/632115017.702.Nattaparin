package week7;

public class Bike extends Bicycle{
    public Bike(int currentSpeed){
        setSpeed(currentSpeed);
        System.out.println("Normal Bike");
        if(checkSpeed(getSpeed())){
            setSpeed(getSpeed()-currentSpeed);
        }
    }
    public void SpeedUp(){
        setSpeed(getSpeed()+ getConstanceSpeed());
        if (checkSpeed(getSpeed())) {
            setSpeed(getSpeed() - getConstanceSpeed());
        }
    }

    public void Break() {
        setSpeed(getSpeed() - getConstanceSpeed());
    }
}