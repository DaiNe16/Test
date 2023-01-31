
package workshop1;

import java.util.Scanner;

public class Part1 {

    public static void main(String[] args) {
        int rows;
        int cols;
        int matrix[][];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter number of cols:  ");
        cols = scanner.nextInt();
        matrix = new int[rows][cols];
        System.out.println("Enter the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("\nm["+i+"]["+j+"] = ");
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Matrix inputted: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.format("%3d",matrix[i][j]);
            }
            System.out.println("\n");
        }
        //calculate sum of the matrix
        int sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println("Sum: "+sum);
        float average = sum/(rows*cols);
        System.out.println("Average: "+average);
        
    }
    
}
