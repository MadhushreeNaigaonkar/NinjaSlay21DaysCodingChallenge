import java.util.*;

 

public class Day6 {

    

    public static int size(int n){

        int k=0;

        for(int i=n;i>0;i=i/10){

            k++;

        }

        return k;

    }

 

    public static void main(String[] args) {

        

        int n;

        Scanner sc = new Scanner(System.in);

        n=sc.nextInt();

        int k=size(n);

        int sum=0;

        for(int i=n;i>0;i=i/10){

            int d=i%10;

            sum=sum+(int)Math.pow(d,k);

        }

        if(sum==n){

            System.out.println("true");

        }

        else{

            System.out.println("false");

        }

    }

}