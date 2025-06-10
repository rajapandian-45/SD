import java.util.Arrays;

public class d2postassignment {

	    public static void main(String[] args) {
	        int[] arr = {4, 5, 2, 6, 9, 10};
	        int target = 8;	       
	        Arrays.sort(arr);  	      
	        int left = 0;
	        int right = arr.length - 1;
	        boolean found = false;

	        while (left < right) {
	            int sum = arr[left] + arr[right];
	            if (sum == target) {
	                System.out.println("Pair found: " + arr[left] + " + " + arr[right] + " = " + target);
	                found = true;
	                break;
	            } else if (sum < target) {

	                left++; 
	            } else {

	                right--; 
	            }
	        }
	        
	        if (!found) {

	            System.out.println("No pair found that sums to " + target);
	        }
	    }
	}
