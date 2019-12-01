//W.A.P to find duplecate element in an array
package Array1D;

import java.util.Arrays;

public class FindDuplicateElement {

    public static void main(String[] args) {
        int i, j, duplicate;

        int a[] = {5, 6, 8, 7, 9, 8, 5};

        System.out.println("Duplicate values are : ");
        for (i = 0; i < a.length; i++) {

            for (j = i + 1; j < a.length; j++) {

                if (a[i] == a[j]) {
                    duplicate = a[j];

                    System.out.println(duplicate);
                }

            }

        }

    }

}
