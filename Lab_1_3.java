//Write a program to input feet and inch and display total inch. 
//Ex- Enter 1 feet and 10 inches.
package lab_1;

import java.util.Scanner;

public class Lab_1_3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the feet value: ");
        int feet = sc.nextInt();

        System.out.println("Enter the inches value: ");
        int inche = sc.nextInt();

        int totalInches = ((feet * 12) + inche);
        System.out.println("The total inches : " + totalInches);

    }
}
