import java.lang.reflect.Array;

public class shipWithDays {
  public static void main(String[] args) {
    int weights[] = { 3, 2, 2, 4, 1, 4 };
    int days = 3;
    int sum = 0;
    for (int i : weights) {
      sum = sum + i;
    }
    int start = Arrays.stream(weights).max().getAsInt();
    int end = sum;
    int ans = 0;

    while (start <= end) {
      int mid = (start + end) / 2;
      System.out.println(mid);
      int s = 0;
      int count = 1;
      for (int i = 0; i < weights.length; i++) {
        if (s + weights[i] > mid) {
          count++;
          sum = weights[i];
        } else {
          sum = sum + weights[i];
        }
      }
      if (count == days) {
        ans = mid;
        break;
      } else if (count < days) {
        end = mid - 1;
      } else {
        start = mid + 1;
      }
    }
    // System.out.println(ans);

  }
}
