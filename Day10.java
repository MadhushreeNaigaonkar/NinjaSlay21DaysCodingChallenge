import java.util.* ;
import java.io.*; 
public class Solution {
    public static int findCase(char ch) {
        // Write your code here.
        int ascii=ch;
        if(65<=ascii && ascii<=90){
            return 1;
        }
        else if(97<=ascii&& ascii<=122){
            return 0;
        }

        return -1;
    }
}
