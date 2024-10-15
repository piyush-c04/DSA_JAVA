//leetcode Medium questions be like :) Easy
package Arrays;

public class MountainPeakElement {
    public static void main(String[] args) {
        int[] arr = {1,2,3,6,16,400,2,1,0};
        int n= arr.length-1;
        int start = 0;
        int end =n;
        int ans = peakelement(arr,n,start,end);
        System.out.println(ans);
    }

    static int peakelement(int[] arr,int n,int start,int end)
    {
        while(start != end)
        {
            int mid = start + (end-start)/2;
            if(arr[mid] < arr[mid+1]) //if mid element is smaller than next, so the ans might be ahead of the mid
            {
                start = mid+1;
            }
            else // the answers range decreases till mid
            {
                end = mid;
            }
        }
        return start;
    }

}


