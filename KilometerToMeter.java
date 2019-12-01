
//W.A.P to convert km and mt from user given meter length???
package Conversion;

import java.util.Scanner;

public class KilometerToMeter {

    public static void main(String[] args) {
        int km, mt;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the meter distance : ");
        mt = SC.nextInt();
        
        km = mt / 1000;
        mt = mt % 1000;

        System.out.println("\nKM : " + km + "\nMeters : " + mt);

    }
}
