//W.A.P to short the numbers inside a array using bubble technique
package Array1D;
import java.util.Arrays;

public class ShortBuble {

    public static void main(String[] args) {

        int i, j;   //Variables
        int[] p = {5, 7, 6, 5, 2, 8, 9}; //Array
        
        System.out.println("==========[Output]==========");
        System.out.println("Accending order of p[values] : ");
        for (i = 0; i < p.length; i++) {
            for (j = 0; j < p.length - 1; j++) {

                if ((p[j]) > (p[j + 1])) {

                    //if the condition is true then swap two values   
                    p[j] = p[j] + p[j + 1];
                    p[j + 1] = p[j] - p[j + 1];
                    p[j] = p[j] - p[j + 1];

                }
            }

        }

        for (i = 0; i < p.length; i++) {    //to get output
            System.out.print(p[i] + ", ");
        }
    }
}
