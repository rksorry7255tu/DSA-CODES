import java.util.Arrays;
import java.util.Collections;

public class frequency {
  public static void main(String[] args) {
    int nums[] = { 1, 2, 4 };
    int k = 5;
    // int count = 0;
    // Arrays.sort(nums);

    // int result = 0;
    // int i = nums.length - 1;
    // int j = i - 1;
    // while (i > 0 && j > 0) {
    // while (nums[i] - nums[j] <= k - count) {
    // if (count >= k) {
    // break;
    // }
    // count = count + nums[i] - nums[j];
    // j--;
    // }
    // i--;
    // if (i - j > result) {
    // result = i - j;
    // }
    // }
    int i = 0;
    int j = 1;
    int ans = 0;
    while (j < nums.length) {
      while (i < j) {
        int diff = nums[j] - nums[i];
        if (diff < k) {
          i++;
        }
      }
      if (j - i > ans) {
        ans = j - i;
      }
      j++;
      i = 0;
    }
    System.out.println(ans);
  }
}
