//Marge two array into third array
package Array1D;
public class MargeTwoArrays {

    public static void main(String[] args) {
        int i;
        int[] a = {2, 8, 7, 1};
        int[] b = {6, 3, 9, 4};
        int[] c = new int[a.length + b.length];    //C[] length = a[length] + b[lrngth];

        //Inseting a[] into c[]
        for (i = 0; i < a.length; i++) {
            c[i] = a[i];
        }
        //inserting b[] into c[]
        for (i = 0; i < b.length; i++) {
            c[a.length + i] = b[i];
        }
        System.out.println("==========[Output]==========");
        System.out.println("Marge of a[] and b[], is c[] : ");
        for (i = 0; i < a.length + b.length; i++) {
            System.out.print(c[i]+", ");
        }
    }
}
