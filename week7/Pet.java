package week7;
//nattaparin somnuek 6302115017
public class Pet {
    String name;
    String Species;
    String Color;
    int age;
 
   
   
   public Pet(){

   }
   public Pet(String name, int age, String Species,String Color){
        this.name = name;
        this.age = age;
        this.Species = Species;
        this.Color = Color;
   
   }
   public void introduce(){
       System.out.print("Name:"+name);   
       System.out.print(" Species:"+Species);
       System.out.print(" Color:"+Color);
       System.out.println(" Age:"+age);
   }
}
