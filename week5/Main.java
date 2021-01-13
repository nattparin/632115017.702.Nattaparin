package week5;

//nattaparin somnuek 6302115017
public class Main {
    public static void main(String[] args) {
        Circle circle1 = new Circle(0, 0, 2.0);
        Circle circle2 = new Circle(1.0, 2.0, 3.0);
        Circle circle3 = new Circle(3.0, 5.0);
        Circle circle4 = new Circle(-1.0, -1.0, -1.0);

    System.out.println("Area of cir1 = "+ circle1.Area());
    System.out.println("Circumferrene of cir1= "+ circle1.Cir());
    System.out.println("Area of cir2 = "+ circle2.Area());
    System.out.println("Circumferrene of cir2= " + circle2.Cir());
    System.out.println("Area of cir3 = "+ circle3.Area());
    System.out.println("Circumferrene of cir3= " + circle3.Cir());
    System.out.println("Area of cir4 = "+ circle4.Area());
    System.out.println("Circumferrene of cir4= " + circle4.Cir() );
    System.out.println("Is ciecle 1 intersec circle 2; "+circle1.intersected(circle2));
    System.out.println("Is ciecle 1 intersec circle 3; "+circle1.intersected(circle3));

    }

}

class Circle{
    private double x;
    private double y;
    private double r;

    public Circle(double x, double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
        if(this.r<0)
         this.r = 0.0;
    }

    public Circle(double x,double y){
        this(x, y, 1.0);
    }

    public double Area(){
        return Math.PI*Math.pow(r,2);
    }

    public double Cir(){
        return Math.PI*2*r;
    }

    public boolean intersected(Circle circle ){
        double distance ;

        distance = Math.sqrt(Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2));
        if (distance < this.r+circle.r)
         return true;
         else
         return false;
    }
}