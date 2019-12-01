
//Write a Program to check Vowel or Consonant using Switch Case ??



import java.util.Scanner;

public class CheckVowelConsonant {

    public static void main(String [] args){

        char character;
       // boolean isVowel=false;
        Scanner SC=new Scanner(System.in);
        System.out.println("Enter the character : ");
       character=SC.next().charAt(0);

       switch (character) {

           case 'a' :
               System.out.println("a is a vowel ");
               break;
           case 'e':
               System.out.println("e is a vowel ");
               break;
           case 'i':
               System.out.println("i is a vowel ");
               break;
           case 'o':
               System.out.println("o is a vowel ");
               break;
           case 'u':
               System.out.println("u is a vowel ");
               break;
           case 'A':
               System.out.println("A is a vowel ");
               break;
           case 'E':
               System.out.println("E is a vowel ");
               break;
           case 'I':
               System.out.println("I is a vowel ");
               break;
           case 'O':
               System.out.println("O is a vowel ");
               break;
           case 'U':
               System.out.println("U is a vowel ");
               break;
           default:
               if ((character>='a' && character<='z')|| (character>='A' && character<='Z')) {
                   System.out.println("Its a consonant");

               }
               else
                   System.out.println("Ints invalid input");


       }

    }
}
