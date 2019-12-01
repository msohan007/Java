package Conversion;

import java.util.Scanner;

public class SecondToHoursMinutesSecond {

    public static void main(String[] args) {
        int hour, minute, second;

        Scanner SC = new Scanner(System.in);
        System.out.println("Enter the second : ");
        second=SC.nextInt();
        
        
        hour=second/3600;
        second=second%3600;
        minute=second/60;
        second=second%60;
        
        System.out.println(hour+":"+minute+":"+second);
        
        

    }

}
