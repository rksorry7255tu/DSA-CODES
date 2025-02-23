import java.util.Scanner;

public class array1 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size = sc.nextInt();
    int array[] = new int[size];
    System.out.println("enter " + size + " numbers in arrays");
    for (int i = 0; i < size; i++) {
      array[i] = sc.nextInt();
    }
    System.out.println("Entered numbers in array is:");
    for (int i = 0; i < size; i++) {
      System.out.println(array[i]);
    }
  }
}
