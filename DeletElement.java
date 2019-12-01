//W.A.P to delete an element from the array
package Array1D;
import java.util.Scanner;
public class DeletElement {
    public static void main(String[] args) {
        int delete, i, j;
        Scanner SC = new Scanner(System.in);
        int a[] = new int[5];
        //Input Array Values
        System.out.println("Please enter the array values : ");
        for (i = 0; i < a.length; i++) {
            a[i] = SC.nextInt();
        }
        //Eneter the integer which will be deleted from the array
        System.out.println("Please enter the value for delete : ");
        delete = SC.nextInt();

        // to delete the matched number
        for (i = 0; i < a.length; i++) {

            if (delete == a[i]) {
                // to shift the array values to fill the empty place
                for (j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];
                }
                break;
            }
        }
        System.out.println("==========[Output]==========");
        for (i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
    }
}
