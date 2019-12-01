//W.A.P to insert an element in am array
package Array1D;
import java.util.Arrays;
import java.util.Scanner;
public class InsertElement {
    public static void main(String[] args) {
        int n, i, add,p;

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the total number of array values : ");
        n = SC.nextInt();
        int a[] = new int[n];  //Array name 
        System.out.println("Enter the array values : ");
        for (i = 0; i < n; i++) {
            a[i] = SC.nextInt();
        }
        System.out.println("Enter position of new value array :");
        p = SC.nextInt();
        System.out.println("Enter the number want to include into array :");
        add = SC.nextInt();

        for (i = n-1 ; i > p-1 ; i--) {  //to move the numbers
            a[i] = a[i - 1];
        }
        a[p-1]=add;   //insert the number 
        
        System.out.println("==========[Output]==========");
       for(i=0; i<n; i++){
       
           System.out.print(a[i]+", ");}

    }

}
