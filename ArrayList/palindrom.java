public class palindrom {
  public static void main(String[] args) {
    int x = 10;
    int reverse = 0;
    int n = x;
    while (n > 0) {
      int digit = n % 10;
      n = n / 10;
      reverse = reverse * 10 + digit;

    }
    if (reverse == x) {
      System.out.println("palindrom");
    } else {
      System.out.println("notpalindrom");
    }
  }
}
