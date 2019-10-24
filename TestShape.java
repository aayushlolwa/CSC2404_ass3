// 

import java.io.*;

class TestShape
{
     private static BufferedReader in;
     
     private static Shape readShape()
     {
         double rad;
         double len;
         double wid;
         String oneLine;

         try {
           System.out.println("Enter shape type:" );
           do {
               oneLine = in.readLine();
           } while (oneLine.length() == 0 );

           switch (oneLine.charAt(0)) {
               case 'c':
                    System.out.println("Enter radius: ");
                    rad = Integer.parseInt(in.readLine());
                    return new Circle (rad );
               case 's':
                    System.out.println("Enter side: ");
                    len = Integer.parseInt(in.readLine());
                    return new Square(len);
               case 'r':
                    System.out.println("Enter length and width " 
                                     + "on separate lines: ");
                    len = Integer.parseInt(in.readLine() );
                    wid = Integer.parseInt( in.readLine() );
                    return new Rectangle(len, wid);

               default:
                    System.err.println("Need c, r, or s" );
                    return new Circle(0);
           }
         } catch (IOException e) {
           System.err.println(e);
           return  new Circle(0);
         }
     }

     // InsertionSort: sort array a
     private static void insertionSort(Shape [] a)
     {
         for (int p = 1; p < a.length; p++)
         {
               Shape tmp = a[p];
               int j = p;

               for (; j > 0 && tmp.lessThan(a[j-1]); j--)
                   a[j] = a[j-1];
               a[j] = tmp;
         }
     }


     public static void main(String [] args )
     {
         try {
            // Get number of shapes
            System.out.println("Enter number of shapes: ");
            in = new BufferedReader(new InputStreamReader(System.in) );
          
            int numShapes = Integer.parseInt( in.readLine() );

            // Read the shapes
            Shape [] array = new Shape[numShapes ];

            for (int i = 0; i < numShapes; i++)
               array[i] = readShape();

            // Sort and output
            insertionSort (array);
            System.out.println("Sorted by area:" );
            for (int i= 0; i < numShapes; i++)
                 System.out.println(array[i]);

         } catch (Exception e) {
             System.out.println(e);
         }
     }
}
