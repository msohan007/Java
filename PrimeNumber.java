import java.util.Scanner;

// Check prime number: (Prime number means its divisible by i and itself )
public class PrimeNumber {

    public static void main(String [] args){
        int i, num;
        int temp=0;
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter the number : ");
        num=SC.nextInt();

         for(i=2; i<num; i++){
             if(num%i==0){       // If number is divisible by i then its not a prime number
                temp=temp+1;     //I have taken variable temp to not print the output again and again
             }
         }
        if (temp>0){    //here if temp is more than 0 then its not a prime number
            System.out.println(num+" is not prime number");
        }
        else
            System.out.println(num+ " is a prime number");


    }
}
