package paintthings;

/**
 * Rectangle.java
 * @author Salsabil Khoirunisa
 * @version 1.0
 * @since 2023-02-21
 */

public class Rectangle extends Shape{
    private double length;
    private double width;
    
    //Constructor: Sets up the sphere.
    public Rectangle(double l, double w){
        super("Rectangle");
        length = l;
        width = w;
    }
    
    //Returns the surface area of the sphere.
    @Override
    public double area(){
        return length * width;
    }
    
    //Returns the sphere as a String.
    @Override
    public String toString(){
        return super.toString() + " of length " + length + " and of width " + width;
    }
}
