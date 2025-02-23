import java.util.Scanner;

public class matrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter row of matrix");
    int row = sc.nextInt();
    System.out.println("enter column of matrix");
    int column = sc.nextInt();
    int[][] matrix = new int[row][column];
    System.out.println("Enter the Values in matrix");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        matrix[i][j] = sc.nextInt();
      }
    }
    System.out.println("enter a number");
    int number = sc.nextInt();
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        if (matrix[i][j] == number) {
          System.out.println("Index of number is:row=" + i + " column=" + j);
        }
      }
    }

  }
}
