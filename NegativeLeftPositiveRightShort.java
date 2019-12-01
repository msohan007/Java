//Segregate negative and positive elements in a array
package Array1D;

import java.util.Arrays;
import java.util.Scanner;

public class NegativeLeftPositiveRightShort {

    //Main Method
    public static void main(String[] args) {
        int n, i, j;

        Scanner SC = new Scanner(System.in);
        //Insert array limit
        System.out.println("Enter the digit of array : ");
        n = SC.nextInt();

        int arr[] = new int[n];  //Array

        //Insert array values
        System.out.println("Enter the array values : ");
        for (i = 0; i < n; i++) {
            arr[i] = SC.nextInt();
        }

    }

    static void rearrange(int arr[], int n) {
        int j = 0, temp;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                j++;
            }
        }
    }

    // A utility function to print an array 
    static void printArray(int arr[], int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
