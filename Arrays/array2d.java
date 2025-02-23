import java.util.Scanner;

public class array2d {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter row number");
    int row = sc.nextInt();
    System.out.println("Enter column number");
    int column = sc.nextInt();
    int[][] array = new int[row][column];
    System.out.println("enter " + row * column + " numbers in the 2d arrays");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        array[i][j] = sc.nextInt();
      }
    }
    System.out.println("Entered numbers are:");
    for (int i = 0; i < row; i++) {
      for (int j = 0; j < column; j++) {
        System.out.println(array[i][j]);
      }
    }

  }
}
