import java.util.Scanner;

public class CountRepeatedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input array size
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Input number to search
        System.out.print("Enter the number to count: ");
        int target = sc.nextInt();

        // Count occurrences
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == target) {
                count++;
            }
        }

        // Display result
        System.out.println("The number " + target + " is repeated " + count + " time(s).");

        sc.close();
    }
}