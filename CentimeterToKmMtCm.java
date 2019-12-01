//W.A.P to convert centimeter to km, mt and cm??
package Conversion;

import java.util.Scanner;

public class CentimeterToKmMtCm {

    public static void main(String[] args) {

        int km, mt, cm;

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the centimeter value : ");
        cm = SC.nextInt();

        km = cm / 100000;
        cm = cm % 100000;
        mt = cm / 1000;
        cm = cm % 1000;

        System.out.println("\nKm :" + km + "\nMt : " + mt + "\nCm : " + cm);

    }

}
