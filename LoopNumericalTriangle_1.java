
/*
1
2 3
3 4 5
6 7 8 9
10 11 12 13 14
 */

public class LoopNumericalTriangle_1 {
     public static void main(String [] args){
         int i,j;
         int count=0;

         for (i=1; i<=8; i++){

             for(j=1; j<=i; j++){
                 count = count+1;
                 System.out.print(count + " ");
             }
             System.out.println();
         }
     }
}
