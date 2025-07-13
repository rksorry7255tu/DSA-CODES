public class spiral {
  public static void main(String[] args) {
    int matrix[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
    int left = 0;
    int right = matrix.length - 1;
    int top = 0;
    int bottom = matrix.length - 1;
    while (top <= bottom && left <= right) {

      for (int j = left; j <= right; j++) {
        System.out.println(matrix[top][j]);
      }
      top++;
      for (int j = top; j <= bottom; j++) {
        System.out.println(matrix[j][right]);
      }
      right--;
      if (top <= bottom) {

        for (int j = right; j >= left; j--) {
          System.out.println(matrix[bottom][j] + " ");
        }
        bottom--;
      }
      if (left <= right) {
        for (int i = bottom; i >= top; i--) {
          System.out.println(matrix[i][left] + " ");
        }
        left++;
      }

    }
  }
}