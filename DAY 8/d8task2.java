public class d8task2 {

    public static int binarySearch(int[] arr, int left, int right, int target) {
        if (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] > target)
                return binarySearch(arr, left, mid - 1, target);

            return binarySearch(arr, mid + 1, right, target);
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {2, 4, 6, 8, 10, 12, 14};
        int target = 10;

        int result = binarySearch(data, 0, data.length - 1, target);

        if (result != -1)
            System.out.println("Element found at index: " + result);
        else
            System.out.println("Element not found in array.");
    }
}

