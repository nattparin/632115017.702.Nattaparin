package week12;

public class Triangle extends Shape {
    private double base, height; 
    public Triangle() 
    {
        //set default value to width and height
        this.base = 1;
        this.height = 1;
    }
    public Triangle(double base, double height) 
    {
        this.base = base;
        this.height = height;
    }
    
    public double getArea() 
    {
        return 0.5* base * height;
    }
}