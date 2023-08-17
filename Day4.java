import java.util.ArrayList;
import java.util.List;

public class Day4 {
    public static int[] printNos(int x) {
        List<Integer> resultList = new ArrayList<>();
        printNosRecursive(x, resultList);
        
        int[] resultArray = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArray[i] = resultList.get(i);
        }
        
        return resultArray;
    }
    
    private static void printNosRecursive(int x, List<Integer> resultList) {
        if (x <= 0) {
            return;
        }
        
        printNosRecursive(x - 1, resultList);
        resultList.add(x);
    }
}