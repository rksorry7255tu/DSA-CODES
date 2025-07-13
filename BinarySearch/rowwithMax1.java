public class rowwithMax1 {
  public static void main(String[] args) {
    int mat[][] = { { 0, 0, 1 }, { 1, 1, 1 }, { 0, 0, 0 } };
    int index = -1;
    int max1 = 0;
    for (int i = 0; i < mat.length; i++) {
      int count = 0;
      for (int j = 0; j < mat[0].length; j++) {
        if (mat[i][j] == 1) {
          count++;
        }
      }
      if (count > max1) {
        max1 = count;
        index = i;
      }
    }
    System.out.println(index);
  }
}
