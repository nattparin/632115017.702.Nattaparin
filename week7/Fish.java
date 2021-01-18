package week7;
//nattaparin somnuek 6302115017
public class Fish extends Pet{
    String size;  
    boolean Saltwater; 
    String speed;

    public Fish(String name, int age, String Species,String Color){
        this.name = name;
        this.age = age;
        this.Species = Species;
        this.Color = Color;
    }
    public void Size(){
        System.out.print(size);
    }
    public void Swimspeed(){
        System.out.print(speed);
    }
    public void swimtothesea(){
        System.out.println( "My fish "+name+" swim to the sea");
        
    }
    public void Salwater(){
        System.out.println(" Saltwater "+Saltwater);
        
    }
}