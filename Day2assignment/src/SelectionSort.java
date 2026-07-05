import java.util.Scanner;

public class SelectionSort {

    // This method sorts the array using Selection Sort
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        // Move through each element of the array
        for (int i = 0; i < n - 1; i++) {

            // Assume the current element is the smallest
            int minIndex = i;

            // Find the smallest element in the remaining array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap only if a smaller element was found
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
    }

    // This method prints the array
    public static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // Used to take input from the user
        Scanner sc = new Scanner(System.in);

        // Read the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print the original array
        System.out.println("\nArray before sorting:");
        printArray(arr);

        // Sort the array
        selectionSort(arr);

        // Print the sorted array
        System.out.println("Array after sorting:");
        printArray(arr);

        // Close the scanner
        sc.close();
    }
}