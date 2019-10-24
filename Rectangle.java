// Rectangle class 
//  based on Shape
//

public class Rectangle extends Shape
{
    public Rectangle (double len, double wid)
    {
        super("rectangle");
        length = len;
        width = wid;
    }
    public double area()
    {
        return length * width;
    }

    private double length;
    private double width;
}

