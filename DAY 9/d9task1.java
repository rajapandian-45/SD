import java.util.Arrays;

public class d9task1 {
  
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
    
    public static void main(String[] args) {
    
        int[] arr = {1, 2, 4, 4, 5, 6, 8, 10, 12, 14};
        int target = 4;   
        int result = lowerBound(arr, target);
        
        System.out.println("The lower bound of " + target + " is at index: " + result);
 
        if (result < arr.length) {
            System.out.println("The element at this index is: " + arr[result]);
        } else {
            System.out.println("Target is larger than any element in the array.");
        }
    }
}
