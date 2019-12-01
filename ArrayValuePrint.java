
// Write a program and print those values inside array.??

import java.util.Scanner;

public class ArrayValuePrint {
    public static void main(String [] args){

       Way1();
       Way2();



    }


                            //Way-1 : Print declared numbers inside array.
    public static void Way1(){

        int[] num={25,30,65,75};
        // way-1
        for(int i=0; i<num.length; i++) {
            System.out.println(num[i]);

        }
      return;
    }

                                    // Way-2 : Print user entered numbers...
    public static void Way2(){
        int[] num2= new int [5];
        System.out.println("Enter the numbers : ");

        Scanner SC=new Scanner(System.in);

        for(int i=0; i<num2.length; i++){
            num2[i]=SC.nextInt();
            
        }
       for(int k=0; k<num2.length; k++) {

           System.out.print( num2[k]+"; ");

       }
        return;

    }
}
