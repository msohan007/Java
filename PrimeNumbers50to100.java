import java.util.Scanner;

public class PrimeNumbers50to100 {

    public static void main(String [] args){
        int i, j, num1,num2, sum = 0;
        int temp=0;
        Scanner SC=new Scanner(System.in);
        System.out.println("Please enter range numbers : ");
        num1=SC.nextInt();  //Enter the from range
        num2=SC.nextInt();  //Enter the end range

        System.out.println("Prime numbers are : ");
        for(i=num1; i<=num2; i++){
            for(j = 2; j<i; j++){

                if(i%j==0){
                    temp=temp+1;
                }
            }
                if (temp==0){     //to find the prime numbers
                 System.out.print(i +",");
                 sum=sum+i;     //To find the sum of prime numbers

                }
                else
                temp=0;
        }
        System.out.println(" Sum of prime numbers are : "+ sum);
    }
}





