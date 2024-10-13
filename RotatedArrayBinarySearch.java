public class RotatedArrayBinarySearch {
    public static void main(String[] args) {
        int[] arr = {15, 16, 19, 20, 25, 1, 3, 4, 5, 7};
        int target = 5;
        System.out.println(binarySearch(arr, target));
    }

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        // Find the pivot point
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] > arr[mid + 1]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        // Perform binary search based on the pivot point
        if (target >= arr[left] && target <= arr[right]) {
            return binarySearch(arr, target, left, right + 1);
        } else {
            return binarySearch(arr, target, 0, left);
        }
    }

    public static int binarySearch(int[] arr, int target, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }
}
