import java.util.Scanner;

public class MatrixOperations {

    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        int rows, cols, choice;

        // Input number of rows and columns
        System.out.print("Enter number of rows: ");
        rows = sc.nextInt();

        System.out.print("Enter number of columns: ");
        cols = sc.nextInt();

        // Declare matrices
        int[][] A = new int[rows][cols];
        int[][] B = new int[rows][cols];
        int[][] C = new int[rows][cols];

        // Input elements of first matrix
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                A[i][j] = sc.nextInt();
            }
        }

        // Input elements of second matrix
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                B[i][j] = sc.nextInt();
            }
        }

        // Menu starts
        do {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Matrix Addition
                    System.out.println("Result of Addition:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            C[i][j] = A[i][j] + B[i][j];
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 2:
                    // Matrix Subtraction
                    System.out.println("Result of Subtraction:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            C[i][j] = A[i][j] - B[i][j];
                            System.out.print(C[i][j] + " ");
                        }
                        System.out.println();
                    }
                    break;

                case 3:
                    // Matrix Multiplication
                    // Multiplication is possible only if columns = rows
                    if (cols != rows) {
                        System.out.println("Matrix multiplication is not possible.");
                    } else {

                        // Initialize result matrix with 0
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                C[i][j] = 0;
                            }
                        }

                        // Multiply matrices
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                for (int k = 0; k < cols; k++) {
                                    C[i][j] = C[i][j] + (A[i][k] * B[k][j]);
                                }
                            }
                        }

                        // Display multiplication result
                        System.out.println("Result of Multiplication:");
                        for (int i = 0; i < rows; i++) {
                            for (int j = 0; j < cols; j++) {
                                System.out.print(C[i][j] + " ");
                            }
                            System.out.println();
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Thank You!");
                    break;

                default:
                    // Invalid menu choice
                    System.out.println("Invalid Choice! Please try again.");
            }

        } while (choice != 4);

        // Close Scanner
        sc.close();
    }
}