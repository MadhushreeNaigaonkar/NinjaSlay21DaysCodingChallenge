import java.util.* ;
import java.io.*; 
public class Day20 {
 public static int sumOfMaxMin(int[] arr, int n) {

      int min=Integer.MAX_VALUE;

      int max=Integer.MIN_VALUE;

      for (int i = 0; i < arr.length; i++) {

        int num=arr[i];

        min=Math.min(min,num);

        max=Math.max(max,num);

      }

      return max+min;

  }


}