import java.util.Scanner;

public class array {
  public static void main(String[] args) {
    int arr[] = { 1, 4, 3, 2, 6 };
    int j = arr.length - 1;
    for (int i = 0; i < arr.length / 2; i++) {
      int temp = arr[i];
      arr[i] = arr[j];
      arr[j] = temp;
      j--;
    }
    for (int i = 0; i < arr.length; i++) {
      System.out.println(arr[i]);
    }
  }
}
