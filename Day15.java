public class Day15 {

    public static int[] countFrequency(int n, int x, int []nums){

        int[] frequency = new int[nums.length];

        findfreq(nums,frequency);

        return frequency;

    }

    public static void findfreq(int[] nums,int[] freq)

    {

        for(int i=0;i<nums.length;i++)

        {

            if(nums[i]<=nums.length)

            freq[nums[i]-1]++;

        }

    }

}