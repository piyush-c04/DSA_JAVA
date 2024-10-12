package Arrays;
//Problem: to find the smallest number more than greater or equal to the target (doesnt depend on targets existance in arr)
public class Ceiling {
    public static void main(String[] args) {
        int arr[] = {1,2,5,8,11,20,21,23,56,1246,44532};//whenever you see a sorted array , blindly try binsearch
                    //0,1,2,3,4,  5,6 ,7, 8, 9,    10
        int target = 22;
        int start = 0;
        int end = arr.length -1;
        int result = binarysearch(arr,target,start,end);
        System.out.println("Element is at: "+result);
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
         else if(target > arr[mid])
         {
             start = mid+1;
         }
         else if(target < arr[mid])
         {
             end = mid-1;
         }
        }
        //return -1; base code
        return start; // here the start becomes the next least magnitude greater number of the target

    }
}
