import java.util.LinkedHashSet;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        int[] array = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates
        LinkedHashSet<Integer> uniqueNumbers = new LinkedHashSet<>();

        for (int num : array) {
            uniqueNumbers.add(num);
        }

        // Display original array
        System.out.print("Original Array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

        // Display array without duplicates
        System.out.print("\nArray Without Duplicates: ");
        for (int num : uniqueNumbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}