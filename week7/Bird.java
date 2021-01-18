package week7;
//nattaparin somnuek 6302115017
public class Bird extends Pet {
    String fly;  
    boolean country; 
    String speak;

    public Bird(String name, int age, String Species,String Color){
        this.name = name;
        this.age = age;
        this.Species = Species;
        this.Color = Color;
    }
    public void Country(){
        System.out.println("Thailand: "+country);
    }
   
    public void Speak(){
        System.out.println(" Speak:"+speak);
        
    }
    public void CanFly(){
        System.out.print( name+" is can fly ");
    }
} 
