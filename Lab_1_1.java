//Write a program to input feets and inches from the user 
//and display feet=------ and Inch=----- on the output window. 
package lab_1;

import java.util.Scanner;

public class Lab_1_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the feet value: ");
        int feet = sc.nextInt();

        System.out.println("Enter the inches value:");
        int inches = sc.nextInt();

        System.out.println(("The feet value:" + feet) + " and " + "inches value:" + inches);

    }
}
