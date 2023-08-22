import java.util.* ;
import java.io.*; 
public class Day8 {
	 public static int[] termsOfAP(int x){

        int[] newarr = new int[x];

        int start=1,i=0;

        int index=0;

        for(;index<x;)

        {

            i=start*3+2;

            if(i%4!=0)

            {

                newarr[index]=i;

                index++;

            }

            start++;

        }

        return newarr;

    }


}
