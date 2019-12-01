//W.A.P to reverse the numbers inside array


package Array1D;

import java.util.Arrays;

public class ReverseNumber {
    public static void main(String [] args){
    
    int []a={2,5,6,7,8,};
    
  int startValue=0;
 int endValue=a.length-1;
  
 while(startValue<endValue){
  
    a[startValue]=a[startValue]+a[endValue];
    a[endValue]=a[startValue]-a[endValue];
    a[startValue]=a[startValue]-a[endValue];

            startValue++;
            endValue--;
 
  }
      
        System.out.println("==========[Output]==========");
        System.out.println(Arrays.toString(a));
    
    }
    
    
    
}
