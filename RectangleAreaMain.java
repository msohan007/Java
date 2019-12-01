package Class;
import java.util.Scanner;
public class RectangleAreaMain {

    public static void main(String[] args) {
        Rectangle[] rectangles = new Rectangle[3];
        int L, W;
        Scanner SC = new Scanner(System.in);

        for (int i = 0; i < rectangles.length; i++) {
            System.out.println("Enter the lenght and width : " + (i + 1));

            L = SC.nextInt();
            W = SC.nextInt();

            rectangles[i] = new Rectangle(L, W);
        }

        for (int i = 0; i < rectangles.length; i++) {

            rectangles[i].display();

        }
    }

}
