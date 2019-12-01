package Array1D;

import java.util.Arrays;

public class ShortNegativeRightPositiveLeft {

    public static void main(String[] args) {

        int[] a = {5, -8, -9, 2, 3, -7};
        int length = a.length;

        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length - 1; j++) {

                if (a[j] <= 0 && a[j + 1] > 0) {

                    //if the condition is true then swap two values   
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];

                }
            }

        }
        System.out.println("==========[Output]==========");
        System.out.println(Arrays.toString(a));
    }

}
