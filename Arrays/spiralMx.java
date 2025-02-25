import java.util.Scanner;

public class spiralMx {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the row of Matrix:");
    int row = sc.nextInt();
    System.out.println("Enter the column of Matrix:");
    int column = sc.nextInt();

    int[][] spiralMatrix = new int[row][column];
    System.out.println("Enter the value in Matrix:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        spiralMatrix[i][j] = sc.nextInt();
      }
    }
    int rowStart = 0;
    int rowEnd = row - 1;
    int columnStart = 0;
    int columnEnd = column - 1;
    while (rowStart <= rowEnd && columnStart <= columnEnd) {
      for (int i = columnStart; i <= columnEnd; i++) {
        System.out.print(spiralMatrix[rowStart][i] + " ");
      }
      rowStart++;
      System.out.println();
      for (int i = rowStart; i <= rowEnd; i++) {
        System.out.print(spiralMatrix[i][columnEnd] + " ");
      }
      columnEnd--;
      System.out.println();
      for (int i = columnEnd; i >= columnStart; i--) {
        System.out.print(spiralMatrix[rowEnd][i] + " ");
      }
      rowEnd--;
      System.out.println();
      for (int i = rowEnd; i >= rowStart; i--) {
        System.out.print(spiralMatrix[i][columnStart] + " ");
      }
      columnStart++;
      System.out.println();
    }

  }

}
