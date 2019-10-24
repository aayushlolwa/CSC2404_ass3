// Circle class based on Shape
//
public class Circle extends Shape
{
    public Circle(double rad)
    {
        super("circle");
        radius = rad;
    }

    public double area()
    {
        return PI * radius * radius;
    }

    static final private double PI = 3.141592653;
    private double radius;

}
