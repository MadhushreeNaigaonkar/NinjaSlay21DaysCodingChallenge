
import java.util.ArrayList;

public class Day11 {

	public static ArrayList<ArrayList<Integer>> numberPattern(int n) {

		// Write your code here.
		int k=0;
		ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
		for(int i=1; i<=n; i++) {
			ArrayList<Integer> list = new ArrayList<>();
			for(int j=1; j<=n-i; j++) {
				list.add(-1);
			}
			for(int j=1; j<=i; j++) {
				list.add(k%9+1);
				k++;
			}
			ans.add(list);
		}

		return ans;
	}
}