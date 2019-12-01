//Convert Length program :
//–Input: length in feet and inches ; –Output: equivalent length in centimeters 
package lab_1;

import java.util.Scanner;

public class Lab_1_5 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the feet value: ");
        int a = sc.nextInt(); // feet input
        System.out.println("Enter the inches value: ");
        int b = sc.nextInt(); // inches input

        int c = ((a * 12) + b); // to extract total inches value
        double CentimeterValue=(c * 2.54); // to extract centimeter value
        System.out.println("The total centimeters :" + CentimeterValue); //result

    }
}
