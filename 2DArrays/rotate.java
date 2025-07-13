public class rotate {
  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

    int[][] result = new int[matrix.length][matrix.length];
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        result[i][j] = matrix[matrix.length - 1 - j][i];
        System.out.println(result[i][j]);
      }
    }
  }
}