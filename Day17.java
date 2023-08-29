import java.util.*;

 

public class Day17 {

    public static int linearSearch(int n, int num, int[] arr) {

        return findIndex(arr, num);

    }

 

    public static int findIndex(int[] arr, int num) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == num) {

                return i; 

            }

        }

        return -1; 

    }

 

    public static void main(String[] args) {

        int[] arr = {6, 7, 8, 1};

        int num = 4;

        int index = linearSearch(arr.length, num, arr);

 

        if (index != -1) {

            System.out.println("The first occurrence of " + num + " is at index " + index);

        } else {

            System.out.println(num + " is not present in the array.");

        }

    }

}