package week9;

public class Rectangle  extends Shape {
    private int width;
    private int height;

    public Rectangle( int width,int height) {
        this.width = width;
        this.height = height;
    }
    public String toString() {
        return super.toString()+"\nThis is a rectangle with width as" +width +"and height as"+height;
    }

}
