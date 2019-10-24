// Abstract base class for shapes
abstract class Shape
{
     abstract public double area();

     public Shape(String shapeName )
     {
            name = shapeName;
     }

     final public boolean lessThan (Shape rhs ) 
     {
             return area() < rhs.area();
     }
     public String toString()
     {
           return name + " of area " + area(); 
     } 

     private String name;

}
