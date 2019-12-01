//Write a program to input time in 24 hrs clock format and display it in 12 hours am/pm clock.
//Ex-: input : time in 24hrs format= 23:15:15;  Output: time in 12hrs format= 11:15:15 pm 
//Assume that minutes and second will less than 60. 
package lab_1;

import java.util.Scanner;
import org.w3c.dom.ls.LSOutput;

public class Lab_1_6 {

    public static void main(String[] args) {
        int hh, mm, ss;
        String time, flag;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter time in 24 hour format : ");
        time = SC.next();

        hh = Integer.parseInt(time.substring(0, 2));
        mm = Integer.parseInt(time.substring(0, 2));
        ss = Integer.parseInt(time.substring(0, 2));

        if (hh > 24) {
            hh = 24;
        }
        if (hh < 0) {
            hh = 0;
        }

        if (hh > 12) {
            hh = hh - 12;
            flag = "p.M";

        } else {
            flag = "A.M";
        }
        System.out.println("Time in 12 hours format is :" + hh + ":" + mm + ":" + ss + " " + flag);

    }

}
