

//Calculate the total area of a CubeRectangleArea and a Rectangle: ??

public class CubeRectangleArea {
     

    public static void main(String[] args)  //Main method
    { 
      myCubeArea ();
      myRectangleArea();
         
   
    }
//calculation the value of CubemyCubeArea
    public static void myCubeArea () //Object method 1
    {
        int length = 10;
        int width = 25;
        int height = 8;
      
        int result=length*width*height;
        System.out.println("Cube area is : "+ result);
        

    }
//Calculation the value of Rectangle
    public static void myRectangleArea() //Object method 2
    {
        int length = 10;
        int width = 25;
        int result2=2*length+width;
        System.out.println("Rectangle area is : "+ result2);
    }
    
}
