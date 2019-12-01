import java.util.Scanner;

public class Rectangle {  //Name of the public class: Rectangle 

    int length;
    int width;

    int myRectangleArea() {
        return (2 * length + width);

    }

    Rectangle() {

        Scanner Value = new Scanner(System.in);
        System.out.println("Please enter length :");
        length = Value.nextInt();
        System.out.println("Please enter width :");
        width = Value.nextInt();

    }

}
