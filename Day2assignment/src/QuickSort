import java.util.Scanner;

public class QuickSort {

    // This method performs Quick Sort
    public static void quickSort(int[] arr, int low, int high) {

        if (low < high) {

            // Find the correct position of the pivot
            int pivotIndex = partition(arr, low, high);

            // Sort the left part
            quickSort(arr, low, pivotIndex - 1);

            // Sort the right part
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    // This method places the pivot in the correct position
    public static int partition(int[] arr, int low, int high) {

        int pivot = arr[high];
        int i = low - 1;

        // Compare every element with the pivot
        for (int j = low; j < high; j++) {

            if (arr[j] < pivot) {
                i++;

                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot in its correct position
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    // This method prints the array
    public static void printArray(int[] arr) {

        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("\nArray before sorting:");
        printArray(arr);

        quickSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();
    }
}