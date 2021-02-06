package week9;

public class Cube extends Rectangle{
   private int widthc;

    public Cube ( int width,int height,int widthc) {
        super(width,height);
       this.widthc = widthc;
    }
    public String toString() {
        return super.toString()+"\nThis is a cube with the side of"+widthc;
        
    }
}
