
//Write a program to find maximum and minimum number: ....

import java.util.Scanner;

public class FindMaxMinArray {

    public static void main(String [] args) {

        Scanner SC = new Scanner(System.in);

        int[] num = new int[5];
        System.out.println("Enter the numbers : ");
        for (int i = 0; i < num.length; i++) {
            num[i] = SC.next().length();
        }

            int max=num[0]; int min=num[0];

            for(int i=1; i<num.length; i++ ){

                if (num[i]>max){

                    max=num[i];
                }
        }
            System.out.println("Highest number is : "+ max);

        }

}
//Answer is coming highest digit not highest number??? find out the problem???


