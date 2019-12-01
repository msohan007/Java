//Write a program to check Even or Odd number...


import java.util.Scanner;

public class EvenOddNumber {

    public static void main(String [] args){
        int num;


        Scanner SC=new Scanner(System.in);
        System.out.println("Enter a integer number : ");

        num=SC.nextInt();

        if (num%2==0 ){
            System.out.println("Entered number is even");
        }
        else

            System.out.println("Entered number is odd ");

    }




    }

