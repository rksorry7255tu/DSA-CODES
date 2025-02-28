public class count {
  public static void main(String[] args) {
    int n = 2446;
    int n1 = n;
    int count = 0;
    while (n1 > 0) {
      int digit = n1 % 10;
      if (digit != 0 && n % digit == 0) {
        count++;
      }
      n1 = n1 / 10;
    }
    System.out.println(count);
  }

}
