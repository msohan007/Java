
package Class;

import java.util.Scanner;

public class StudentMain {

    public static void main(String[] args) {
        int geography, history, english, mathemetic, science, assignment, sum;
        Scanner SC = new Scanner(System.in);
        System.out.println("Enter all subject's marks : ");
        geography = SC.nextInt();
        history = SC.nextInt();
        english = SC.nextInt();
        mathemetic = SC.nextInt();
        science = SC.nextInt();
        assignment = SC.nextInt();
        Student student=new Student(geography, history, english, mathemetic, science, assignment);
        sum=geography+ history+ english+ mathemetic+ science+ assignment;
        
        System.out.println(student.toString());
        System.out.println("Total Marks: "+sum);
        
    }
  
   
    
}
