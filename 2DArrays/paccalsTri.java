public class paccalsTri {
  public static void main(String[] args) {
    paccalsTri p = new paccalsTri();
    int r = 5;
    for (int i = 1; i <= r; i++) {
      for (int j = 1; j <= r; j++) {
        int comb = p.factorial(i - 1) / (p.factorial(i - j - 2) * p.factorial(j - 1));
        System.out.println(comb);
      }
    }
  }

  public int factorial(int n) {
    return n == 0 || n == 1 ? 1 : n * factorial(n - 1);
  }
}
