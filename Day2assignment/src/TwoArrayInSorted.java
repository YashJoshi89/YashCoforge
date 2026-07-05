import java.util.Scanner;

public class TwoArrayInSorted {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of first array
        System.out.print("Enter size of first array: ");
        int n = sc.nextInt();
        int[] arr1 = new int[n];

        System.out.println("Enter elements of first sorted array:");
        for (int i = 0; i < n; i++) {
            arr1[i] = sc.nextInt();
        }

        // Input size of second array
        System.out.print("Enter size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];

        System.out.println("Enter elements of second sorted array:");
        for (int i = 0; i < m; i++) {
            arr2[i] = sc.nextInt();
        }

        // Merge arrays
        int[] merged = new int[n + m];

        int i = 0, j = 0, k = 0;

        while (i < n && j < m) {
            if (arr1[i] <= arr2[j]) {
                merged[k++] = arr1[i++];
            } else {
                merged[k++] = arr2[j++];
            }
        }

        // Copy remaining elements of arr1
        while (i < n) {
            merged[k++] = arr1[i++];
        }

        // Copy remaining elements of arr2
        while (j < m) {
            merged[k++] = arr2[j++];
        }

        // Display merged array
        System.out.println("Merged Sorted Array:");
        for (int num : merged) {
            System.out.print(num + " ");
        }

        sc.close();
    }
}