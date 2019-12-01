//W.A.P to short the numbers inside a array using selection technique
package Array1D;

public class ShortSelection {

    public static void main(String[] args) {
        int i, j;

        int num[] = {5, 8, 6, 4, 3, 4, 1};

        System.out.println("==========[Output]==========");
        System.out.println("Accending order of num[values] : ");
        for (i = 0; i < num.length; i++) {

            for (j = i + 1; j < num.length; j++) {
                if (num[j] < num[i]) {

                    num[i] = num[i] + num[j];
                    num[j] = num[i] - num[j];
                    num[i] = num[i] - num[j];
                }
            }
        }
        for (i = 0; i < num.length; i++) {
            System.out.print(num[i] + ", ");
        }
    }

}
