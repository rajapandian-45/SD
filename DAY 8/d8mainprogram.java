import java.util.Scanner;

public class d8mainprogram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter value to search and delete: ");
        int target = sc.nextInt();

        boolean found = false;
        int[] newArr = new int[n - 1];
        int index = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == target && !found) {
                found = true;
                continue;
            }
            if (index < newArr.length)
                newArr[index++] = arr[i];
        }

        if (found) {
            System.out.println("Element found and deleted. New array:");
            for (int num : newArr) {
                System.out.print(num + " ");
            }
        } else {
            System.out.println("Element not found.");
        }
    }
}
