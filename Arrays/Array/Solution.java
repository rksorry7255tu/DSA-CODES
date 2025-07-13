import java.util.*;

class Solution {
  public void main(String[] args) {
    int[] nums = { 1, 2, 3, 6, 7, 5, 7 };
    Arrays.sort(nums);
    int result[] = new int[2];
    int count = 0;
    HashSet<Integer> set = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != i + 1 && count <= 1) {
        result[1] = i + 1;
        count++;
      }
      if (set.contains(nums[i])) {
        result[0] = nums[i];
      }
      set.add(nums[i]);

    }
    for (int i = 0; i < result.length; i++) {
      System.out.println(result[i]);
    }
  }
}