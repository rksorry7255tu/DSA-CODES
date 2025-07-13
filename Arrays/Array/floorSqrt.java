public class floorSqrt {
  public static void main(String[] args) {
    long n = 4;
    long sqrt = 1;
    long start = 1;
    long end = n;
    if (n == 0) {
      sqrt = 0;
    }
    while (start <= end) {

      long mid = (start + end) / 2;
      long squire = mid * mid;

      if (start == mid && mid == end) {
        sqrt = end;
        break;
      }
      if (squire == n) {
        sqrt = mid;
        break;
      } else if (squire > n) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
      // System.out.println(sqrt);

    }
    System.out.println(sqrt);
  }
}
