
import java.util.*;

public class Strings {
  public static void main(String[] args) {
    int nums[] = { 3, 2, 3 };
    HashMap<Integer, Integer> map = new HashMap<>();
    List<Integer> list = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
      if (!map.containsKey(nums[i])) {
        map.put(nums[i], 1);
      } else {
        map.put(nums[i], map.get(nums[i]) + 1);
      }
    }
    for (Map.Entry<Integer, Integer> e : map.entrySet()) {
      if (e.getValue() > nums.length / 3) {
        list.add(e.getKey());
      }
    }
    System.out.println(list);

  }
}