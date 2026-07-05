import java.util.Scanner;

public class SecondMax{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Initialize max and second max
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        // Find the largest and second largest elements
        for (int i = 0; i < n; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }

        // Display the result
        if (secondMax == Integer.MIN_VALUE) {
            System.out.println("There is no second largest element.");
        } else {
            System.out.println("The second largest element is: " + secondMax);
        }

        sc.close();
    }
}