package week7;



public class Bicycle  {
    private int currentSpeed;
    final private static int SPEEDUPDOWN = 5;
    public Bicycle(){
        
    }
    public void setSpeed(int setCurrentSpeed){
        this.currentSpeed = setCurrentSpeed;
    }
    public int getSpeed(){
        return currentSpeed;
    }
    public int getConstanceSpeed(){
        return SPEEDUPDOWN;
    }
    public void DisplaySpeed(){
        System.out.println(getSpeed()+" km/h.");
    }
    public boolean checkSpeed(int getspeed){
        if(getspeed > 99){
            System.out.println("can't go 99");
            return true;
        }
        else {
            return false;
        }
    }
}