//W.A.P to find maximum and minimum numbers???
package Array1D;

public class MaxMinNumber {

    public static void main(String[] args) {
        int max, min;
        int[] a = {12, 45, 36, 87, 12, 45, 5};

        max = 0;
        min = 0;

        for (int i = 0; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }

            if (max > a[i]) {
                min = a[i];
            }
        }
        System.out.println("==========[Output]==========");
        System.out.println("Maximum value is : " + max);
        System.out.println("Minimum value is : " + min);
    }

}
