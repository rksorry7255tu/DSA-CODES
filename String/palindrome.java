//column and row is given then print element
public class palindrome {
  public static void main(String[] args) {
    int row = 5;
    int col = 3;
    int result = 1;
    for (int i = 0; i < col - 1; i++) {
      result = result * (row - 1 - i);

      result = result / (i + 1);

    }
    System.out.println(result);
  }
}
