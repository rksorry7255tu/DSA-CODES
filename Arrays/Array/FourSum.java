
import java.util.*;

public class FourSum {
  public static void main(String[] args) {
    int nums[] = { 1000000000, 1000000000, 1000000000, 1000000000 };
    int target = 0;
    Arrays.sort(nums);
    List<List<Integer>> result = new ArrayList<>();
    List<List<Integer>> result1 = new ArrayList<>();
    HashSet<ArrayList<Integer>> setset = new HashSet<>();
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        HashSet<Integer> set = new HashSet<>();
        for (int k = j + 1; k < nums.length; k++) {
          int find = target - nums[i] - nums[j] - nums[k];
          if (set.contains(find)) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(nums[i]);
            list.add(nums[j]);
            list.add(nums[k]);
            list.add(find);
            Collections.sort(list);
            setset.add(list);
          }
          set.add(nums[k]);
        }
      }
    }
    result.addAll(setset);
    // return nums.length>=4?result:result1;
    System.out.println(setset);

  }
}
