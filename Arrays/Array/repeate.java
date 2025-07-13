import java.util.*;

public class repeate {
  public static void main(String[] args) {
    // int nums[] = { 1, 2, 3, 6, 7, 5, 7 };
    // int nums[] = { 4, 3, 6, 2, 1, 1 };
    int nums[] = { 3, 5, 4, 1, 1 };
    int result[] = new int[2];
    HashSet<Integer> set = new HashSet<>();
    Arrays.sort(nums);
    int j = 1;
    for (int i = 0; i < nums.length; i++) {
      set.add(nums[i]);
      if (i > 0 && nums[i] == nums[i - 1]) {
        result[0] = nums[i];
      }
      if (!set.contains(j)) {
        result[1] = j;
      }
      {
        j++;
      }
    }
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }

  }
}
