import java.util.*;

public class Day19 {

	public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		Map<Integer, Integer> mp = new HashMap<>();

		for(int a : arr) {
			mp.put(a, mp.getOrDefault(a, 0)+1);
		}
		for(Map.Entry<Integer, Integer> e: mp.entrySet()){
			if(e.getValue() == 2){
				return e.getKey();
			}
		}
		return -1;
	}
}