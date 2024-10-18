class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0]; // coz the single element can also be an subarray 
        for(int i=1;i<nums.length;i++)
        {
            nums[i] = Math.max(nums[i],nums[i]+nums[i-1]);
            max = Math.max(nums[i] , max);
        }
        return max;
    }
}
OR
public class MaxSubArraySum {
    public static void main(String[] args) {
        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int max = Integer.MIN_VALUE;
        int sum= 0 ;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if(max < sum)
            {
                max = sum;
            }

            if(sum < 0)
            {
                sum = 0;
            }
        }
        System.out.println(sum);
    }
}
