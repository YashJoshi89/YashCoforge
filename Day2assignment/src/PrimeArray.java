import java.util.Scanner;

public class PrimeArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {

        // Numbers less than or equal to 1 are not prime
        if (num <= 1) {
            return false;
        }

        // Check divisibility from 2 to num/2
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                return false; // Not a prime number
            }
        }

        return true; // Prime number
    }

    public static void main(String[] args) {

        // Create Scanner object
        Scanner sc = new Scanner(System.in);

        // Input the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        // Declare the array
        int[] arr = new int[n];

        // Input array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Print prime numbers
        System.out.println("Prime numbers in the array are:");
        for (int i = 0; i < n; i++) {
            if (isPrime(arr[i])) {
                System.out.print(arr[i] + " ");
            }
        }

        // Close the scanner
        sc.close();
    }
}