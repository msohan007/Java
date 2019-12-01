//Write a program to enter first name, last name, age and weight separated by spaces and display it.
//Ex- Simi Mann 20 120.5 : 
//Name: Simi Mann 
//Age:20 
//Weight: 120.5 
package lab_1;

import javax.xml.namespace.QName;
import java.util.Scanner;
//

public class Lab_1_4 {

    public static void main(String[] args) {
        String FirstName, LastName;
        int Age, Weight;

        Scanner SC = new Scanner(System.in);

        System.out.println("Enter your first name, last name, age and weight seperated by space :");

        FirstName = SC.next();
        LastName = SC.next();
        Age = SC.nextInt();
        Weight = SC.nextInt();
        System.out.println("First Name : " + FirstName + "Last Name : " + LastName);
        System.out.println("Age : " + Age);
        System.out.println("Weight : " + Weight);

    }

}
