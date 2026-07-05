import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input position to delete
        System.out.print("Enter the position to delete (1 to " + n + "): ");
        int pos = sc.nextInt();

        // Check if position is valid
        if (pos < 1 || pos > n) {
            System.out.println("Invalid Position!");
        } else {
            // Shift elements to the left
            for (int i = pos - 1; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }

            // Decrease array size
            n--;

            // Display updated array
            System.out.println("Array after deletion:");
            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        sc.close();
    }
}