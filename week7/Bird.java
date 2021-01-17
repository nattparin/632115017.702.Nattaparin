package week7;
//nattaparin somnuek 6302115017
public class Bird extends Pet {
    String country;  
    boolean fly; 
    String speak;

    public Bird(String name, int age, String Species,String Color){
        this.name = name;
        this.age = age;
        this.Species = Species;
        this.Color = Color;
    }
    public void Country(){
        System.out.print(country);
    }
   
    public void Speak(){
        System.out.print(" Speak:"+speak);
        
    }
    public void CanFly(){
        System.out.println(" Can fly: "+fly);
    }
} 
