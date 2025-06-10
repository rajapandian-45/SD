import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

public class d2task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        
        int size = scanner.nextInt();
        Integer[] userArray = new Integer[size];
        System.out.println("Enter " + size + " elements:");
        
        for (int i = 0; i < size; i++) {
            userArray[i] = scanner.nextInt();
        }
        Integer[] sortedArray = userArray.clone();
        Arrays.sort(sortedArray, Collections.reverseOrder());    
        System.out.println("Original Array: " + Arrays.toString(userArray));
        System.out.println("Sorted (Descending) Array: " + Arrays.toString(sortedArray));       
    }
}
