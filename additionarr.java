package Recursion;

import java.lang.reflect.Array;

public class additionarr {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int n = arr.length;
        int result = sum(arr,n-1);
        System.out.println(result);
    }
    static int sum(int[] arr,int n){
        if(n<0)
        {
            return 0;
        }
        else{
            int sum = arr[n];
            sum+=sum(arr,n-1);
            return sum;
        }

    }

}
