// Write a program to input total inches from the user, 
//convert it into feet and inches. Display feet and inch. 
//Ex: Enter inch=15 Answe: 1 feet and 3 inches.
package lab_1;

import java.util.Scanner;

public class Lab_1_2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the inches value: ");
        int inch = sc.nextInt();
        int feet = (inch / 12);
        int inches = inch % 12;
        System.out.println("The converted value is : " + feet + " feet and " + inches + " inches ");

    }
}
