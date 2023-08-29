import java.util.* ;

import java.io.*; 

 

public class Day16 {

 

    static int largestElement(int[] arr, int n) {

        // Write your code here.

        n=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>n){

              n=arr[i];

            }

            

        }

        return n;

    }

}

