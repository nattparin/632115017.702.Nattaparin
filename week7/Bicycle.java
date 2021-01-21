package week7;


public class Bicycle  {
 public int speed;  
    public Bicycle(int speed){
    if(speed>99)
        this.speed=99;
    else
        this.speed=speed;
    }
    public void SpeedUp() {
        if(speed>99)
            speed=99;
        else
            speed+=5;
        System.out.println("Speed UP");
    }
    public void Break(){
        speed -=5;
        System.out.println("Break");
    }
    public void chack(){
        System.out.println("Speed is "+speed);
    } 
    }
