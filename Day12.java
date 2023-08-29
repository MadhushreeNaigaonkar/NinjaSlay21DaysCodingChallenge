import java.util.* ;
import java.io.*; 
public class Day12 {
	public static void printPattern(int n){
		// Write your code here.
		for(int i=1; i<=n; ++i){

                   for(int space=1; space <=n - i; ++space){

                System.out.print(" ");

            }

            for(int star = 1; star <= i; ++star){

                System.out.print("*");

            }

            for(int star = 2; star <= i; ++star){

                System.out.print("*");

            }System.out.println();

        }
	}
}
