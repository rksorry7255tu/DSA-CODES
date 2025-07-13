import java.util.Arrays;

public class piles {
  public static void main(String[] args) {
    piles p = new piles();
    // int piles[] = { 30, 11, 23, 4, 20 };
    int piles[] = { 3, 6, 7, 11 };
    int h = 8;
    Arrays.sort(piles);

    int minresult = Integer.MAX_VALUE;
    for (int i = 1; i <= piles[piles.length - 1]; i++) {
      boolean result = p.noOfHours(piles, h, i);
      if (result == true) {
        minresult = i;
        break;
      }
    }
    System.out.println(minresult);

    // Arrays.sort(piles);
    // int start = piles[0];
    // int end = piles[piles.length - 1];
    // int count = 0;
    // int sp = 1;
    // while (start <= end) {
    // int mid = (start + end) / 2;
    // // System.out.println(mid);
    // for (int i = 0; i < piles.length; i++) {
    // int item = piles[i];
    // int q = item / mid;
    // int r = item % mid;
    // if (r != 0) {
    // count = count + q + 1;
    // } else {
    // count = count + q;
    // }
    // }
    // System.out.println(count);
    // if (count == h) {
    // sp = mid;
    // break;
    // } else if (count > h) {
    // start = mid + 1;

    // } else {
    // end = mid - 1;
    // }
    // }
    // // System.out.println(sp);
  }

  public boolean noOfHours(int piles[], int h, int j) {
    int count = 0;
    for (int i = 0; i < piles.length; i++) {
      int q = piles[i] / j;
      int r = piles[i] % j;
      if (r != 0) {
        count = count + q + 1;
      } else {
        count = count + q;
      }
    }
    if (count == h) {
      return true;

    }

    return false;
  }
}
