package week12;

public class Rectangle extends Shape 
{
private double widthh, lengthh; 
public Rectangle() 
{
    
    this.widthh = 1;
    this.lengthh = 1;
}
public Rectangle(double widthh, double lengthh) 
{
    this.widthh = widthh;
    this.lengthh = lengthh;
}

public double getArea() 
{
    return widthh * lengthh;
}

} 
