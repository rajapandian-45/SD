public class d9postassignment {
 
    public static int lowerBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] >= target) {
                right = mid;  
            } else {
                left = mid + 1;
            }
        }
        
        return left; 
    }

    public static int upperBound(int[] arr, int target) {
        int left = 0, right = arr.length;
        
        while (left < right) {
            int mid = left + (right - left) / 2;
            
            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        
        return left; 
    }


    public static int countOccurrences(int[] arr, int target) {
        int lower = lowerBound(arr, target);
        int upper = upperBound(arr, target);
        
        return upper - lower; 
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 4, 4, 5, 6, 7};
        int target = 4;
        
        int lower = lowerBound(arr, target);
        System.out.println("Lower Bound of " + target + " is at index: " + lower);
            
        int upper = upperBound(arr, target);
        System.out.println("Upper Bound of " + target + " is at index: " + upper);
            
        int count = countOccurrences(arr, target);
        System.out.println("The target " + target + " appears " + count + " times.");
    }
}
