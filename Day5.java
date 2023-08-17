public class Day5 {
    public static int sumFirstN(int n) {
        // Write Your Code Here
        int sum=0;
        while(n!=0){
            sum+=n;
            n--;
        }
        return sum;
    }
}