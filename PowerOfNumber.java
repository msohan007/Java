
//Calculate the power of a number :

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String [] args){
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the value of base and exponent :");
        int base=SC.nextInt();
        int exponent=SC.nextInt();
        int result1=  (int) Math.pow(base,exponent);  // Technique-1 by using Math.pow();
        System.out.println("The result1 is : "+ result1);

        // Way-2

        int base1=2;
        int exponent2=3;
        int result2=1;

        while (exponent2>0){

            result2=result2*base1;
            exponent2--;

            System.out.println("The result2 is :"+result2);

        }




    }

}
