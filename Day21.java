import java.util.* ;
import java.io.*; 
public class Day21 
{
	public static boolean checkDiff(int[] arr, int N, int K){

        for (int i=0; i<N; i++){

            for (int j=0; j<N; j++){

                if(arr[i]-arr[j]==K && i!=j) return true;

            }

        }

        return false;

    }}