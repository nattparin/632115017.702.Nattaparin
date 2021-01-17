package week7;
//nattaparin somnuek 6302115017
public class Dog  extends Pet{
    String size;  
    boolean longhair; 
    String bark;
     
    public Dog(String name, int age, String Species,String Color){
        this.name = name;
        this.age = age;
        this.Species = Species;
        this.Color = Color;
    }
    public void Size(){
        System.out.print(size);
    }
    public void Bark(){
        System.out.print(bark);
    }
    public void Run(){
        System.out.println("My dog "+name+" run to the jungle");
    }
    public void Hair(){
        System.out.println(" longhair "+longhair);
        
    }
}
