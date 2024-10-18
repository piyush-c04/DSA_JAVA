package Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class smallerThanCurrent {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 2, 8, 10, 11};
        int[] ans = new int[nums.length];

        // Create a copy of nums
        int[] copy = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            copy[i] = nums[i];
        }

        // Create a HashMap to store each element and its first occurrence in the sorted array
        HashMap<Integer, Integer> pairs = new HashMap<>();

        // Sort the copy array
        Arrays.sort(copy);

        // Store the number of elements smaller than the current element in the HashMap
        for (int i = 0; i < nums.length; i++) {
            pairs.putIfAbsent(copy[i], i);  // Only store the first occurrence
        }

        // Assign the number of smaller elements for each original number in the ans array
        for (int i = 0; i < nums.length; i++) {
            ans[i] = pairs.get(nums[i]);  // Use original nums to get the value from the map
        }

        // Print the result
        System.out.println("Original numbers: " + Arrays.toString(nums));
        System.out.println("Count of smaller numbers: " + Arrays.toString(ans));
    }
}
