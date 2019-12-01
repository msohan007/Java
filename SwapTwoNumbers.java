
//Write a program to swap two numbers :

public class SwapTwoNumbers {

    public static void main(String [] args){

        //Way-1: swap using third variable "t".....
        int a=25; int b=35; int t;

        t=a;    //t=25
        a=b;    //a=35
        b=t;    //b=25
        System.out.println("Way-1 : ");
        System.out.println("a= "+a);
        System.out.println("b= "+b);

        //Way-2: swap without using third variable "t".....
        int x=30; int y=10;
        x=x+y;  //x=30+10=40
        y=x-y;  //y=40-10=30
        x=x-y;  //y=40-30
        System.out.println("Way-2 : ");
        System.out.println("x= "+x);
        System.out.println("y= "+y);

    }
}
