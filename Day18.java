import java.util.ArrayList;

 

public class Day18 {

   public static int removeDuplicates(ArrayList<Integer> arr, int n) {

       ArrayList<Integer> al = new ArrayList(n);

       int c=arr.get(0),d=1;

       for(int i=1;i<n;i++)        {            
        if(arr.get(i)!=c)           
         {   
               ++d;         
                         
              c = arr.get(i);               
            
            }        }

       return d;

   }

}

