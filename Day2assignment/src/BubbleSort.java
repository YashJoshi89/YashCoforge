import java.util.Scanner;

public class BubbleSort {

    // This method sorts the array using Bubble Sort
    public static void bubbleSort(int[] arr) {
        int n = arr.length;

        // Repeat the process for all elements
        for (int i = 0; i < n - 1; i++) {

            // This checks if any swapping happened in this pass
            boolean swapped = false;

            // Compare two adjacent elements
            for (int j = 0; j < n - i - 1; j++) {

                // Swap if the left element is greater
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    // Swapping happened
                    swapped = true;
                }
            }

            // If no swapping happened, the array is already sorted
            if (!swapped) {
                break;
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

        // Scanner is used to take input from the user
        Scanner sc = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Read the array elements
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Display the array before sorting
        System.out.println("\nArray before sorting:");
        printArray(arr);

        // Sort the array
        bubbleSort(arr);

        // Display the sorted array
        System.out.println("Array after sorting:");
        printArray(arr);

        // Close the scanner
        sc.close();
    }
}