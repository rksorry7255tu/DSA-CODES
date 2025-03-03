public class fibonacci {
  public static void main(String[] args) {
    fibonacci f = new fibonacci();
    System.out.println(f.fib(3));
  }

  public int fib(int n) {

    return n > 1 ? fib(n - 1) + fib(n - 2) : n == 0 ? 0 : 1;
  }
}
