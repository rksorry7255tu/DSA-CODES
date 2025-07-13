import java.util.*;

public class median {
  public static void main(String[] args) {
    int matrix[][] = { { 1, 4, 9 }, { 2, 5, 6 }, { 3, 8, 7 } };
    int arr[] = new int[matrix.length * matrix[0].length];
    int m = 0;
    for (int[] i : matrix) {
      for (int j : i) {
        arr[m] = j;
        m++;
      }

    }
    Arrays.sort(arr);

    if (arr.length != 0) {
      // return (arr[arr.length / 2] + arr[(arr.length + 1) / 2]) / 2;
      System.out.println((arr[arr.length / 2] + arr[(arr.length + 1) / 2]) / 2);
    } else {
      System.out.println(arr[arr.length / 2]);
    }
    // return arr[arr.length / 2];
  }
}
