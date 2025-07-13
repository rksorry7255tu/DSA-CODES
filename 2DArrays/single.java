import java.util.HashMap;

public class single {
  public static void main(String[] args) {
    int nums[] = { 1 };
    int res = 0;
    HashMap<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], 1);
      } else {
        map.put(nums[i], map.get(nums[i]) + 1);
      }
    }
    System.out.println(map);
    for (int i = 0; i < nums.length; i++) {
      if (map.get(nums[i]) == 1) {
        res = nums[i];
      }
    }
    System.out.println(res);
  }
}
