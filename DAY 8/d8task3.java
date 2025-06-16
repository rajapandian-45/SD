public class d8task3 {

    public static int search(int[] arr, int left, int right, int target) {
        if (left > right) return -1;

        int mid = left + (right - left) / 2;

        if (arr[mid] == target)
            return mid;

        if (arr[left] <= arr[mid]) {
            if (target >= arr[left] && target < arr[mid])
                return search(arr, left, mid - 1, target);
            else
                return search(arr, mid + 1, right, target);
        }

        if (target > arr[mid] && target <= arr[right])
            return search(arr, mid + 1, right, target);
        else
            return search(arr, left, mid - 1, target);
    }

    public static void main(String[] args) {
        int[] rotatedArray = {6, 7, 8, 1, 2, 3, 4, 5};
        int target = 3;

        int index = search(rotatedArray, 0, rotatedArray.length - 1, target);

        if (index != -1)
            System.out.println("Element found at index: " + index);
        else
            System.out.println("Element not found.");
    }
}

