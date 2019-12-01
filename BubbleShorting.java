
//1.	Bubble shorting:

import java.util.Arrays;

public class BubbleShorting {

    public static void main(String [] args) {
        System.out.println("Acceding order os array a is : ");
        int[] a = {25, 65, 46, 28, 78, 26, 45, 29};
        int i, j, temp;
        for (i = 0; i < a.length; i++) {  //

            for (j = 0; j < a.length -1 - i; j++) {  //number of round or face

                if (a[j] > a[j+1]) {

                    temp = a[j];       //swapping between two adjacent integers
                    a[j] = a[j+1];
                    a[j+1] = temp;

                }
            }
        }
        System.out.println(Arrays.toString(a));  //way-1 to get output;
        //for (i = 0; i < a.length; i++) {      //way-2 to get output;
            //System.out.print(a[i] + ",");




    }
}
