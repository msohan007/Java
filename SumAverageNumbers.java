//W.A.P to sum and average the arry numbers
package Array1D;
public class SumAverageNumbers {

    public static void main(String[] args) {
        int sum = 0, i;
        double count, average;
        
        int arr[] = {2, 5, 35, 4, 1, 6};
        
        count=0;
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            count=count+1;

        }
        average=sum/count;
        
        System.out.println("=========[Output]==========");
        System.out.println("Sum of arrays numbers is : " + sum);
        System.out.println("Aeverage of the array is : "+average);
    }

}
