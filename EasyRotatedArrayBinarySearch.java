public class RotatedArrayBinarySearch
{
	public static void main(String[] args) {
		int[] arr = {10,16,20,1,2,3,4,5,9};
		int target = 4;
		int start = 0;
		int end = arr.length-1;
	   int ans =  binarysearch(arr,target,start,end);
	   System.out.println("Element is at: "+ans);
	    
	}   
	static int binarysearch(int[] arr,int target,int start,int end)
	{
	    
	  while(start <= end)
	  {
	      int mid = start + (end-start)/2;
	      
	      if(arr[mid] == target)
	      {
	          return mid;
	      }
	      
          if(arr[start] <= arr[mid]) // left is sorted
          /*
          Why Check If the Left Half is Sorted?
In a binary search, you normally divide the array into two halves. However, because the array is rotated, we can't blindly assume the two halves are sorted. Therefore, we need to check which half of the array is sorted because that will determine where to look for the target.

The Importance of Checking the Sorted Half
The binary search works by repeatedly halving the array, but we need to check which side is sorted to decide which half to search further. This is because the target can only be in the sorted half.

Example with a Rotated Array:
Consider the array {10, 16, 20, 1, 2, 3, 4, 5, 9} and the target 3.

First Step: The initial start = 0, end = 8, mid = 4 (i.e., arr[mid] = 2).

The array from start to mid is [10, 16, 20, 1, 2]. Is this sorted? No, it's not, because arr[start] > arr[mid].
So, the sorted half must be on the right side of mid (from mid+1 to end).
Second Step: We then move to the right half (from mid+1 to end), which is [3, 4, 5, 9].

This part of the array is sorted. Now we can check if the target lies in this range.
          */
          {
            
            if(arr[start] <= target && arr[mid]> target)
            {
                end = mid-1; // reduce the space from full array to mid-1 size
            }
            else{
                start = mid+1; //but if the 
            }
            
          }
          
          else{ //right half is sorted
              if(arr[mid] < target && arr[end]>=target)
                  {
                      start = mid+1;
                  }
                  else
                  {
                      end = mid-1;
                  }
              }
	  }
return -1;

	}
}
