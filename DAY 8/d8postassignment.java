public class d8postassignment {

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, result = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                result = mid;
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] sortedArray = {1, 2, 2, 2, 3, 4, 5}; 
        int target = 2;

        int first = firstOccurrence(sortedArray, target);
        int last = lastOccurrence(sortedArray, target);

        if (first == -1 || last == -1) {
            System.out.println("Element not found.");
        } else {
            int frequency = last - first + 1;
            System.out.println("Frequency of " + target + " is: " + frequency);
        }
    }
}

