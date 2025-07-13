
public class matrix {
  public static void main(String[] args) {
    int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
    int target = 3;
    for (int[] i : matrix) {
      for (int j : i) {
        if (j == target) {
          System.out.println(true);
        }
      }
    }
  }
}
