import java.util.Scanner;


public class GradeDistribution_Switch {
    
    public static void main(String[] args) {

        int Marks;
        System.out.println("Enter the marks please : ");
        Scanner SC = new Scanner(System.in);
        Marks = SC.nextInt();

        if (Marks < 0 || Marks > 100) {
            System.out.println(" Invalid Marks ");
        } else if (Marks >= 90) {
            System.out.println(" You have got excellent ");
        } else if (Marks >= 80) {
            System.out.println("You have got very good");
        } else if (Marks >= 70) {
            System.out.println("You have got good");
        } else if (Marks >= 60) {
            System.out.println("You have got not bad");
        } else if (Marks >= 50) {
            System.out.println("You have got bad");
        } else {
            System.out.println("Everyone is good at something.");
            System.out.println("You are good at something.");
        }
    
    }
}
