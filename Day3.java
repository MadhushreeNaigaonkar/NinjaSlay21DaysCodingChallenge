import java.util.Scanner;

public class Day3 {
	
	public static void main(String[] args) {
		// Write your code here
		 int n;
		 Scanner sc=new Scanner(System.in);
		 n=sc.nextInt();
		int sum_even=0;
		int sum_odd=0;
		 while(n!=0){
			 int digit=n%10;
			 if(digit%2==0){
				 sum_even+=digit;
			 }
			 else{
				 sum_odd+=digit;
			 }
			 n=n/10;
		 }
		 System.out.println(sum_even+" "+sum_odd);

	}
}

