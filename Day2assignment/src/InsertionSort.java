import java.util.Scanner;

public class InsertionSort {

    // This method sorts the array using Insertion Sort
    public static void insertionSort(int[] arr) {

        // Start from the second element
        for (int i = 1; i < arr.length; i++) {

            int current = arr[i];
            int j = i - 1;

            // Move larger elements one position ahead
            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            // Place the current element in the correct position
            arr[j + 1] = current;
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

        insertionSort(arr);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();
    }
}