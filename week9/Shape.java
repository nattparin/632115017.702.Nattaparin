package week9;

public class Shape {
    public String toString(){
      return "This is a shape";
    }
    public static void main(String[] args) {
        Cube cube1 =new Cube(20, 30, 40);
        System.out.println(cube1.toString());
    }
}
