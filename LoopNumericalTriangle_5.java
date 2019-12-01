/*
1
2 6
3 7 10
4 8 11 13
5 9 12 14 15
 */
public class LoopNumericalTriangle_5 {
    public static void main(String [] args){
        int i,j, num;

        for(i=1; i<=5; i++){
            num=i;
            for(j=1; j<=i; j++){

                System.out.print(num+" ");
                num=num+5-j;
            }
            System.out.println();
        }
    }
}
