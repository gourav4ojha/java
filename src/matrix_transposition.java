import java.util.*;

public class matrix_transposition {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int rows = 3, cols = 3;
        int[][] arr = new int[rows][cols];

        System.out.println("Enter matrix elements row by row:");

        // Proper input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        int[][] transpose = new int[cols][rows];

        // Transpose logic
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = arr[i][j];
            }
        }

        // Print transpose matrix
        System.out.println("Transpose Matrix:");
        for (int i = 0; i < transpose.length; i++) {
            for (int j = 0; j < transpose[0].length; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

