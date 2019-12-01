import java.util.Scanner;
/*
1
21
321
4321
54321
 */
public class LoopNumericalTriangle_2 {
    public static void main(String [] args){
        int i,j ,num;

        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the number : ");

        num=SC.nextInt();

        for(i=1; i<=num; i++){

            for(j=i; j>= 1; j--){

                System.out.print(j);
            }
            System.out.println();
        }



    }
}
