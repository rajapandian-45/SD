import java.util.Arrays;

public class d7task3 {

    public static void insertionSort(int[] sample) {
        System.out.println("Before Sorting: " + Arrays.toString(sample));

        for (int i = 1; i < sample.length; i++) {
            int key = sample[i];
            int j = i - 1;
            while (j >= 0 && sample[j] > key) {
                sample[j + 1] = sample[j];
                j = j - 1;
            }
            sample[j + 1] = key;
        }
        System.out.println("After Sorting: " + Arrays.toString(sample));
    }
    public static void main(String[] args) {
        int[] arr = {19, 49, 39, 69, 59};
        insertionSort(arr);
    }
}
