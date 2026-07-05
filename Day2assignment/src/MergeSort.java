import java.util.Scanner;

public class MergeSort {

    // This method divides the array into smaller parts
    public static void mergeSort(int[] arr, int left, int right) {

        if (left < right) {

            int mid = (left + right) / 2;

            // Sort the left half
            mergeSort(arr, left, mid);

            // Sort the right half
            mergeSort(arr, mid + 1, right);

            // Merge both halves
            merge(arr, left, mid, right);
        }
    }

    // This method merges two sorted arrays
    public static void merge(int[] arr, int left, int mid, int right) {

        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data into temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }

        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        // Merge the temporary arrays
        while (i < n1 && j < n2) {

            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy remaining elements from the left array
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy remaining elements from the right array
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
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

        mergeSort(arr, 0, n - 1);

        System.out.println("Array after sorting:");
        printArray(arr);

        sc.close();
    }
}