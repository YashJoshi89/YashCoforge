import java.util.Scanner;

public class InsertNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Create array with one extra space
        int[] arr = new int[n + 1];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to insert
        System.out.print("Enter the number to insert: ");
        int num = sc.nextInt();

        // Input position
        System.out.print("Enter the position (1 to " + (n + 1) + "): ");
        int pos = sc.nextInt();

        // Check if position is valid
        if (pos < 1 || pos > n + 1) {
            System.out.println("Invalid Position!");
        } else {
            // Shift elements to the right
            for (int i = n; i >= pos; i--) {
                arr[i] = arr[i - 1];
            }

            // Insert the new number
            arr[pos - 1] = num;

            // Display updated array
            System.out.println("Array after insertion:");
            for (int i = 0; i <= n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}